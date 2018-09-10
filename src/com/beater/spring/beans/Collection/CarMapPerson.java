package com.beater.spring.beans.Collection;

import java.util.List;
import java.util.Map;

import com.beater.spring.beans.Car;

public class CarMapPerson {
	private String name;
	private Map<String,Car> cars;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "CarMapPerson [name=" + name + ", cars=" + cars + "]";
	}
	
}
