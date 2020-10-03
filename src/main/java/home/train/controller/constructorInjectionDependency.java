package home.train.controller;

import home.train.sevice.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class constructorInjectionDependency {

    private final GreetingService service;

    public constructorInjectionDependency(@Qualifier("greetingServiceImpConstructor") GreetingService service) {
        this.service = service;
    }

    public String getGreeting(){
        return service.sayHello();
    }
}
