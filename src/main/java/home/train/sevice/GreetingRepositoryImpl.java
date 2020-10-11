package home.train.sevice;

public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String GetEnglishGreeting() {
        return "hello - primary Greeting Service";
    }

    @Override
    public String GetGermanGreeting() {
        return "bonjour - service d'accueil principal";
    }

    @Override
    public String GetFranceGreeting() {
        return "Hallo - primärer Begrüßungsdienst";
    }
}
