package home.train.sevice;

public class PrimaryGreetingServiceEnglish implements GreetingService {

    private GreetingRepository repository;

    public PrimaryGreetingServiceEnglish(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayHello() {
        return repository.GetEnglishGreeting();
    }
}
