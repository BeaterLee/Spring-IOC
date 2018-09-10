package com.beater.spring.beans.annotation.respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beater.spring.beans.annotation.TestObject;

@Repository
public class UserRespositoryImpl implements UserRespository {
	
	@Autowired(required=false)
	//required属性存在指定为false的时候，即使IOC容器中不存在兼容类型的bean，运行也不会报错
	private TestObject testObject;
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("save...");
		System.out.println(testObject);
	}

}
