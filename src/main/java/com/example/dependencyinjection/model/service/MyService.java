package com.example.dependencyinjection.model.service;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    public String operation() {
        return "Executing some important process";
    }
}
