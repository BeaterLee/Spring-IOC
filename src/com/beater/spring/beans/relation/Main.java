package com.beater.spring.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beater.spring.beans.autowire.Address;
import com.beater.spring.beans.autowire.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		Address address = (Address) ctx.getBean("address2");
		System.out.println(address);
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}

}
