package home.train.sevice;

public class GreetingFactoryBean {

     private final GreetingRepository repository;

    public GreetingFactoryBean(GreetingRepository repository) {
        this.repository = repository;
    }

    public GreetingService createGreetingService(String lang){

        switch (lang){
//            case "en":
//                return new PrimaryGreetingServiceEnglish(repository);
            case "fr":
                return new PrimaryGreetingFranceService(repository);
            case "gr":
                return new PrimaryGreetingGermanService(repository);
            default:
                return new PrimaryGreetingServiceEnglish(repository);
        }
    }
}
