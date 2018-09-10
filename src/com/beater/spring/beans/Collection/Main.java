package com.beater.spring.beans.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CarMapPerson mapPerson = (CarMapPerson) ctx.getBean("person5");
		System.out.println(mapPerson);
		Person person = (Person) ctx.getBean("person7");
		System.out.println(person);
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getProperties());
	}
}
