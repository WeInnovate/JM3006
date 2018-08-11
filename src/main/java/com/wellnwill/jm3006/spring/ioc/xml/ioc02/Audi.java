package com.wellnwill.jm3006.spring.ioc.xml.ioc02;

public class Audi implements Car{

	public Audi() {
		System.out.println("Audi is being created.");
	}

	public void driveTheCar() {
		System.out.println("Driving the Audi...");
	}

}
