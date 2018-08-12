package com.wellnwill.jm3006.spring.di.noxml.eg02.field;

public class Car {

	public Engine engine;

	public Car() {
		System.out.println("Car is being built.");
	}

	public void driveTheCar() {
		engine.start();
		System.out.println("Driving the car....");
	}
}
