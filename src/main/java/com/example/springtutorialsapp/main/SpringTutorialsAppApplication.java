package com.example.springtutorialsapp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springtutorialsapp"})
public class SpringTutorialsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTutorialsAppApplication.class, args);
    }

}

