package com.beater.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand, 200000, 350);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	// 是否为单例
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
