package home.train;

import home.train.controller.myController;
import home.train.exampleBean.fakeDataSource;
import home.train.sevice.color;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		myController controller= context.getBean(myController.class);

		fakeDataSource dataSource=context.getBean(fakeDataSource.class);

		System.out.println(color.ANSI_RED+dataSource.getName());

	}

}
