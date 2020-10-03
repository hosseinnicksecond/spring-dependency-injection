package home.train.controller;

import home.train.sevice.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class propertyInjectionController {

    @Qualifier("greetingServiceImpProperties")
    @Autowired
    public GreetingService service;

    public String getGreeting(){
        return service.sayHello();
    }
}
