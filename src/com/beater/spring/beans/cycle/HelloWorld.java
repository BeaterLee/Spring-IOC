package com.beater.spring.beans.cycle;

public class HelloWorld {
	private String name;
	
	public void setName(String name) {
		this.name = name;
		System.out.println("setName...");
	}
	
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
	
	public HelloWorld() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor...");
	}

	public HelloWorld(String name) {
		super();
		this.name = name;
	}
	
}
