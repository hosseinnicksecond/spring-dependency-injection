package home.train.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class setterInjectionControllerTest {

    setterInjectionController controller;

    @BeforeEach
    void setUp() {
        controller= new setterInjectionController();
        controller.setService(new GreetingServiceImpSetter());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }


}