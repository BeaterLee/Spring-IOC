package com.beater.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beater.spring.beans.annotation.controller.UserController;
import com.beater.spring.beans.annotation.respository.UserRespository;
import com.beater.spring.beans.annotation.service.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
//		TestObject to = (TestObject) ctx.getBean("testObject");
//		System.out.println(to);
		UserController controller = (UserController) ctx.getBean("userController");
		
		controller.execute();
		//UserService service = (UserService) ctx.getBean("userService");
		//System.out.println(service);
		//UserRespository userRespository = (UserRespository) ctx.getBean("userRespository");
		//System.out.println(userRespository);
	}

}
