package com.fasttrackit.firstSpringProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Train {

    private final Engine engine;

    public Train(@Qualifier("myEngine") Engine engine) {        //prin @Qualifier pot indica cu ce instanta de engine voi dota trenul; aici e cel din metoda myEngine
        System.out.println("Building train");
        System.out.println(engine);
        this.engine = engine;
    }

}