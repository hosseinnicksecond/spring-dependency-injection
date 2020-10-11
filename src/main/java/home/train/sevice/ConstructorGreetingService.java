package home.train.sevice;

public class ConstructorGreetingService implements GreetingService{

    @Override
    public String sayHello() {
        return "hello from Constructor Injection Service";
    }
}
