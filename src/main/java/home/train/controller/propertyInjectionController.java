package home.train.controller;

import home.train.sevice.GreetingService;

public class propertyInjectionController {

    public GreetingService service;

    public String getGreeting(){
        return service.sayHello();
    }
}
