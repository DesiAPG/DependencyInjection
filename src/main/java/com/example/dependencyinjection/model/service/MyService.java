package com.example.dependencyinjection.model.service;

import org.springframework.stereotype.Component;

@Component("MyService")
public class MyService implements IService {
    @Override
    public String operation() {
        return "Executing some important process";
    }
}
