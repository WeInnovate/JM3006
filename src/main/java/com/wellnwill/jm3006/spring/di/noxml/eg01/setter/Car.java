package com.wellnwill.jm3006.spring.di.noxml.eg01.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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

//	seeter injection
	@Autowired
	public void setEngine(Engine engine) {
		System.out.println("Putting engine into car");
		this.engine = engine;
		engine.start();
	}

}
