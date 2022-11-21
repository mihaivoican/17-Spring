package com.fasttrackit.firstSpringProject;

import org.springframework.stereotype.Component;

@Component      //e o cls de tip Bean
public class Car {
    private final Engine engine;
//inainte de a se instantia Car se va instantia Engine pt ca e o dependinta in car
    public Car(Engine engine) {
        System.out.println("Building car");
        System.out.println(engine);
        this.engine = engine;
    }
}