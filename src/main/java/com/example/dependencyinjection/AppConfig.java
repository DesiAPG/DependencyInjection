package com.example.dependencyinjection;

import com.example.dependencyinjection.model.domain.FactureItem;
import com.example.dependencyinjection.model.domain.Product;
import com.example.dependencyinjection.model.service.IService;
import com.example.dependencyinjection.model.service.MyService;
import com.example.dependencyinjection.model.service.MyServiceComplex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("myService")
    public IService registerService() {
        return new MyService();
    }

    @Bean("myServiceComplex")
    @Primary
    public IService registerServiceComplex() {
        return new MyServiceComplex();
    }

    @Bean("FactureItems")
    public List<FactureItem> registerItem() {
        Product product1 = new Product("Sony Camera", 100);
        Product product2 = new Product("OnTrail Bicycle", 250);

        FactureItem line1 = new FactureItem(product1, 2);
        FactureItem line2 = new FactureItem(product2, 4);
        return Arrays.asList(line1, line2);
    }

}
