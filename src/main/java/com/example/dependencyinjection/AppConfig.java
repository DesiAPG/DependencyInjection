package com.example.dependencyinjection;

import com.example.dependencyinjection.model.service.IService;
import com.example.dependencyinjection.model.service.MyService;
import com.example.dependencyinjection.model.service.MyServiceComplex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

}
