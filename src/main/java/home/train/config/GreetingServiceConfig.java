package home.train.config;

import home.train.sevice.GreetingFactoryBean;
import home.train.sevice.GreetingRepository;
import home.train.sevice.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingFactoryBean getGreetingFactoryBean(GreetingRepository repository){
        return new GreetingFactoryBean(repository);
    }
    @Bean
    @Primary
    @Profile("fr")
    public GreetingService getGreetingServiceFrance(GreetingFactoryBean factoryBean){
        return factoryBean.createGreetingService("fr");
    }
    @Bean
    @Primary
    @Profile({"default","en"})
    public GreetingService getGreetingServiceEnglish(GreetingFactoryBean factoryBean){
        return factoryBean.createGreetingService("en");
    }
    @Bean
    @Primary
    @Profile("fr")
    public GreetingService getGreetingServiceGerman(GreetingFactoryBean factoryBean){
        return factoryBean.createGreetingService("gr");
    }
}
