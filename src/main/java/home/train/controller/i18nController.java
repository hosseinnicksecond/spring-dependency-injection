package home.train.controller;

import home.train.sevice.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class i18nController {

    private final GreetingService service;

    public i18nController(@Qualifier("i18n") GreetingService service) {
        this.service = service;
    }
    public String sayHello(){
        return service.sayHello();
    }
}

