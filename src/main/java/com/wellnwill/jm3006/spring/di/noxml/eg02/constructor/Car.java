package com.wellnwill.jm3006.spring.di.noxml.eg02.constructor;

public class Car {

	private final Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car is being built with engine.");
		engine.start();
	}
	
	public void driveTheCar() {
		System.out.println("Driving the car....");
	}

}
