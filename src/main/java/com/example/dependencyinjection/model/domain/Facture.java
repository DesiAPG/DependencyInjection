package com.example.dependencyinjection.model.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Facture {
    @Value("${description.facture}")
    private String description;
    @Autowired
    private Client client;
    @Qualifier("FactureItemsOffice")
    @Autowired
    private List<FactureItem> items;

    @PostConstruct
    public void init() {
        client.setName(client.getName().concat(" José"));
        description = description.concat(" from client: ".concat(client.getName()));
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Facture destroyed ".concat(description));
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<FactureItem> getItems() {
        return items;
    }

    public void setItems(List<FactureItem> items) {
        this.items = items;
    }
}
