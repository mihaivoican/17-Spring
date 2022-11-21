package com.fasttrackit.firstSpringProject;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration      //cu aceasta adnotare anunt Spring ca sa scaneze la pornire ac clasa; pt ca sa initializeze si un myEngine, din metoda cu @Bean
public class MyConfiguration {

    @Bean
    public Engine myEngine() {
        return new Engine(200);     //se creeaza ca bean o noua instanta myEngine
    }
}