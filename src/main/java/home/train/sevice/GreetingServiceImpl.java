package home.train.sevice;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "hello - from Greeting Service Implement";
    }
}
