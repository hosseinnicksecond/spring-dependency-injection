package home.train.controller;

import home.train.sevice.GreetingServiceImpProperties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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