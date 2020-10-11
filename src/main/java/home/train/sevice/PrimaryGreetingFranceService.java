package home.train.sevice;

public class PrimaryGreetingFranceService implements GreetingService{


    private GreetingRepository repository;

    PrimaryGreetingFranceService(GreetingRepository repository) {
        this.repository = repository;
    }


    @Override
    public String sayHello() {
        return repository.GetFranceGreeting();
    }
}
