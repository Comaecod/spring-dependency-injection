package com.comaecod.SpringDI;

import com.comaecod.SpringDI.controllers.MyController;
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
	}

}
