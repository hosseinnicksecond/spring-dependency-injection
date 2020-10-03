package home.train.controller;

import org.springframework.stereotype.Controller;

@Controller
public class myController {

    public String sayHello(){
        System.out.println("Hello World !!!");

        return "honey, don't leave me";
    }
}
