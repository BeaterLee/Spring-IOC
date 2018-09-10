package com.beater.spring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.beater.spring.beans.annotation.respository.UserRespository;

@Service
public class UserService {
	//@Autowired是通过成员变量的名字（userJdbcRespository）去IOC容器中找相应的bean
	@Autowired
	//当一个接口类型有多个实现类并且实现类使用默认的类名时，可以使用Qualifier注解指定实现类的类名来防止多个实现类导致的接口类型的混淆
	//@Qualifier("userRespositoryImpl")
	//@Qualifier("userJdbcRespository")
	private UserRespository userJdbcRespository;
	
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add...");
		userJdbcRespository.save();
	}

}
