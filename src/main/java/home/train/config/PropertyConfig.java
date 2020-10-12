package home.train.config;

import home.train.exampleBean.fakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dataBase.properties")
public class PropertyConfig {

    @Value("train.username")
     private String name;
    @Value("train.password")
     private String password;
    @Value("train.url")
     private String url;

    @Bean
     public fakeDataSource getFakeDataSource(){
         fakeDataSource dataSource= new fakeDataSource();
         dataSource.setName(name);
         dataSource.setPassword(password);
         dataSource.setURL(url);
         return dataSource;
     }
}
