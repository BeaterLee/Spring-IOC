package com.beater.spring.beans.autowire;

public class Car {
	private String carName;
	private int price;
	private int speed;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", price=" + price + ", speed=" + speed + "]";
	}
	
	
}
