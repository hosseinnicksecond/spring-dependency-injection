package home.train.sevice;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpProperties implements GreetingService{

    @Override
    public String sayHello() {
        return "say hello ---properties";
    }
}
