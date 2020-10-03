package home.train.sevice;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18n")
public class i18nEnglish implements GreetingService {
    @Override
    public String sayHello() {
        return "say hello --EN";
    }
}
