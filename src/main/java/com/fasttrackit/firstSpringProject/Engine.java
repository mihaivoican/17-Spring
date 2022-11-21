package com.fasttrackit.firstSpringProject;


import org.springframework.stereotype.Component;

@Component("engine")        //"engine" nu trebuie specificat; e doar ca sa stiu eu ca asa se regasesc implicit clasele mele in containerul de bean-uri (unde se pastreaza /initializeaza clasele adnotate cu @Component
public class Engine {
    private int horsePower;
    //fiindca e un Bean , Spring il gestiioneaza pt instantiere ca obiect
    //primul constructor, fara param
    public Engine() {
        System.out.println("Building default engine");
        horsePower = 100;
    }

    //al doulea constructor cu param
    public Engine(int horsePower) {
        System.out.println("Building engine with horsePower: " + horsePower);
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }
}