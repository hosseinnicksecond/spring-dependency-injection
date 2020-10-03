package home.train.sevice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class primaryServiceImp implements GreetingService{

    @Override
    public String sayHello() {
        return "say hello ---primary";
    }
}
