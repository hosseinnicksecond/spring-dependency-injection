package home.train.sevice;

public class PrimaryGreetingGermanService implements GreetingService {

    private GreetingRepository repository;

    public PrimaryGreetingGermanService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayHello() {
        return repository.GetGermanGreeting();
    }
}
