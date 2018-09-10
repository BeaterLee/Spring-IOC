package com.beater.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName("beater");

//		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld2");
//		helloWorld.hello();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}

}
