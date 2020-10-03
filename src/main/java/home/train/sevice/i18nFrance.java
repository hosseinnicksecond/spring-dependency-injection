package home.train.sevice;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FR")
@Service("i18n")
public class i18nFrance implements GreetingService{
    @Override
    public String sayHello() {
        return "dis bonjour";
    }
}
