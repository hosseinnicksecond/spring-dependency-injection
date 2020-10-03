package home.train.controller;

import home.train.sevice.GreetingServiceImplEng;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class setterInjectionControllerTest {

    setterInjectionController controller;

    @BeforeEach
    void setUp() {
        controller= new setterInjectionController();
        controller.setService(new GreetingServiceImplEng());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }


}