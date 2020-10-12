package home.train.config;

import home.train.exampleBean.fakeDataSource;
import home.train.exampleBean.fakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:dataBase.properties")
public class PropertyConfig {

    @Value("${train.username}")
      String name;
    @Value("${train.password}")
     String password;
    @Value("${train.url}")
     String url;

    @Value("${train.jms.name}")
    String JmsName;
    @Value("${train.jms.password}")
    String JmsPassword;
    @Value("{train.jms.url}")
    String JmsUrl;

    @Bean
    public fakeJmsBroker fakeJmsBroker(){
        fakeJmsBroker broker=new fakeJmsBroker();
        broker.setName(JmsName);
        broker.setPassword(JmsPassword);
        broker.setUrl(JmsUrl);
        return broker;
    }

    @Bean
     public fakeDataSource getFakeDataSource(){
         fakeDataSource dataSource= new fakeDataSource();
         dataSource.setName(name);
         dataSource.setPassword(password);
         dataSource.setURL(url);
         return dataSource;
     }

     @Bean
     public static PropertySourcesPlaceholderConfigurer placeholder(){
        PropertySourcesPlaceholderConfigurer placeholderConfigurer= new PropertySourcesPlaceholderConfigurer();
        return placeholderConfigurer;
     }
}
