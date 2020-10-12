package home.train.config;

import home.train.exampleBean.fakeDataSource;
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

    @Bean
     public fakeDataSource getFakeDataSource(){
         fakeDataSource dataSource= new fakeDataSource();
         dataSource.setName(name);
         dataSource.setPassword(password);
         dataSource.setURL(url);
         return dataSource;
     }

     @Bean
     public PropertySourcesPlaceholderConfigurer placeholder(){
        PropertySourcesPlaceholderConfigurer placeholderConfigurer= new PropertySourcesPlaceholderConfigurer();
        return placeholderConfigurer;
     }
}
