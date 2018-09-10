package com.beater.spring.beans.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName("beater");

//		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld2");
//		helloWorld.hello();
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cycle.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		// 调用close方法摧毁ioc容器，此方法只在ApplicationContext的实现类中实现
		ctx.close();
	}

}
