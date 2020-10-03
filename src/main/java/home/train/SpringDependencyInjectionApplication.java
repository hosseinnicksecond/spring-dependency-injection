package home.train;

import home.train.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		System.out.println("--- i18n");
		i18nController i18nController=(i18nController)context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("--- Primary");
		myController myController=(myController)context.getBean("myController");
		System.out.println(myController.sayHello());

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
