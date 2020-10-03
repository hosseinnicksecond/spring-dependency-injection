package home.train.sevice;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpSetter implements GreetingService {

    @Override
    public String sayHello() {
        return "say hello ---setter";
    }
}
