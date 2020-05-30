package org.arpit.main;

import org.arpit.config.ApplicationConfiguration;
import org.arpit.model.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		HelloWorldService Obj = (HelloWorldService) appContext.getBean("nameObj");
		String Name = Obj.getName();
		
		System.out.println("(Java based Config) Hello " + Name);

	}

}
