package home.train.controller;

import home.train.sevice.GreetingServiceImpConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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