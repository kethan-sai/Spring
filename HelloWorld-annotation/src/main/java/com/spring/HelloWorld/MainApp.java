package com.spring.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld helloWorldBean = context.getBean("myBean", HelloWorld.class);
		helloWorldBean.sayHello();

	}

}
