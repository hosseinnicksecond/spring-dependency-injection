package home.train.controller;

import home.train.sevice.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class setterInjectionController {


    private GreetingService service;

    @Qualifier("greetingServiceImpSetter")
    @Autowired
    public void setService( GreetingService service) {
        this.service = service;
    }

    public String getGreeting(){
        return service.sayHello();
    }
}
