package home.train.controller;

import home.train.sevice.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class myController {

    private final GreetingService service;

    public myController(GreetingService service) {
        this.service = service;
    }

    public String sayHello(){
        return service.sayHello();
    }
}
