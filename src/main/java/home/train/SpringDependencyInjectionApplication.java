package home.train;

import home.train.controller.myController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		myController controller=(myController)context.getBean("myController");

		String greeting =controller.sayHello();

		System.out.println(greeting);
	}

}
