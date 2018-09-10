package com.beater.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		// 参数分别为bean对象，beanName
		System.out.println("Processor:" + arg0 + arg1);
		// 此处需返回一个bean，该方法会在对象被初始化之后调用(init-method)
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		// 参数分别为bean对象，beanName
		System.out.println("Processor:" + arg0 + arg1);
		// 此处需返回一个bean，该方法会在对象被初始化之前调用(init-method)
		return arg0;
	}

}
