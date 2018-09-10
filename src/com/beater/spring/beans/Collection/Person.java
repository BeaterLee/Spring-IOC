package com.beater.spring.beans.Collection;

import java.util.List;

import com.beater.spring.beans.Car;

public class Person {
	private String name;
	private List<Car> cars;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> car) {
		this.cars = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + cars + "]";
	}
	
}
