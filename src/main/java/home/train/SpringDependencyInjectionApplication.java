package home.train;

import home.train.controller.constructorInjectionDependency;
import home.train.controller.myController;
import home.train.controller.propertyInjectionController;
import home.train.controller.setterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		System.out.println("--- Constructor");
		constructorInjectionDependency DIConstructor=
				(constructorInjectionDependency) context.getBean("constructorInjectionDependency");

		System.out.println(DIConstructor.getGreeting());

		System.out.println("--- setter");
		setterInjectionController DISetter=
				(setterInjectionController) context.getBean("setterInjectionController");
		System.out.println(DISetter.getGreeting());

		System.out.println("---Properties");
		propertyInjectionController DIProperties=
				(propertyInjectionController)context.getBean("propertyInjectionController");
		System.out.println(DIProperties.getGreeting());

	}

}
