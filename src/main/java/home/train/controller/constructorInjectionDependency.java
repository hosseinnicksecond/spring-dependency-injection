package home.train.controller;

import home.train.sevice.GreetingService;

public class constructorInjectionDependency {

    private final GreetingService service;

    public constructorInjectionDependency(GreetingService service) {
        this.service = service;
    }

    public String getGreeting(){
        return service.sayHello();
    }
}
