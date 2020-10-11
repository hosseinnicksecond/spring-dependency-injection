package home.train.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class propertyInjectionControllerTest {

    propertyInjectionController controller;

    @BeforeEach
    void setup(){
        controller= new propertyInjectionController();

        controller.service=new GreetingServiceImpProperties();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }

}