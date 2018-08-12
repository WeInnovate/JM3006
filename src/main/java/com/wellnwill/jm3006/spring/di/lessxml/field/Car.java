package com.wellnwill.jm3006.spring.di.lessxml.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

//	field injection
	@Autowired
	private Engine engine;

	public Car() {
		System.out.println("Car is being built.");
	}

	public void driveTheCar() {
		engine.start();
		System.out.println("Driving the car....");
	}
}
