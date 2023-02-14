package com.example.dependencyinjection.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("MyServiceComplex")
//@Primary
public class MyServiceComplex implements IService {
    @Override
    public String operation() {
        return "Executing some important complex process";
    }
}
