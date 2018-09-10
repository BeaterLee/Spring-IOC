package com.beater.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceBeanFactory {

	private static Map<String,Car> cars = new HashMap<>();
	
	static {
		cars.put("audi", new Car("audi",200000,300));
		cars.put("ford", new Car("ford",300000,250));
	}
	
	public Car getCar(String brand) {
		return cars.get(brand);
	}
}
