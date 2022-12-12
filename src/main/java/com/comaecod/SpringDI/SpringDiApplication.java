package com.comaecod.SpringDI;

import com.comaecod.SpringDI.controllers.ConstructorInjectedController;
import com.comaecod.SpringDI.controllers.MyController;
import com.comaecod.SpringDI.controllers.PropertyInjectedController;
import com.comaecod.SpringDI.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringDiApplication.class, args);
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		SetterInjectedController setterInjectedController = applicationContext.getBean(SetterInjectedController.class);
		ConstructorInjectedController constructorInjectedController = applicationContext.getBean(ConstructorInjectedController.class);

		System.out.println("Property: " + propertyInjectedController.saySomething());
		System.out.println("Setter: " + setterInjectedController.saySomething());
		System.out.println("Constructor: " + constructorInjectedController.saySomething());
	}

}
