package home.train.sevice;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String GetEnglishGreeting() {
        return color.ANSI_RED+"hello - primary Greeting Service";
    }

    @Override
    public String GetGermanGreeting() {
        return color.ANSI_BLUE+"Hallo - primärer Begrüßungsdienst";
    }

    @Override
    public String GetFranceGreeting() {
        return  color.ANSI_CYAN+"bonjour - service d'accueil principal";
    }
}
