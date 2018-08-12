package com.wellnwill.jm3006.spring.di.noxml.eg02.setter;

public class Car {

	private Engine engine;

	public Car() {
		System.out.println("Car is being built.");
	}

	public void driveTheCar() {
		System.out.println("Driving the car....");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("Putting engine into car");
		this.engine = engine;
		engine.start();
	}

}
