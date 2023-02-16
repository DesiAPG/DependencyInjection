package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.model.domain.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/facture")
public class FactureController {

    @Autowired
    private Facture facture;

    @GetMapping("/watch")
    public String watch(Model model) {
        model.addAttribute("facture", facture);
        model.addAttribute("title", "Example facture with dependency injection");
        return "facture/watch";
    }
}
