package com.example.dependencyinjection.controllers;

import com.example.dependencyinjection.model.service.IService;
import com.example.dependencyinjection.model.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")
public class indexController {
    private IService service;

    //@Autowired
    public indexController(IService service) {
        this.service = service;
    }

    @GetMapping(path = {"/", "/index", "/home", ""})
    public String index(Model model) {
        model.addAttribute("object", service.operation());
        return "index";
    }

}
