package home.train.controller;

import home.train.sevice.GreetingService;

public class setterInjectionController {

    private GreetingService service;

    public void setService(GreetingService service) {
        this.service = service;
    }

    public String getGreeting(){
        return service.sayHello();
    }
}
