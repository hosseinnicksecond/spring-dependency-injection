package home.train.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class constructorInjectionDependencyTest {

    constructorInjectionDependency controller;

    @BeforeEach
    void setUp() {
        controller= new constructorInjectionDependency(new GreetingServiceImpConstructor());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}