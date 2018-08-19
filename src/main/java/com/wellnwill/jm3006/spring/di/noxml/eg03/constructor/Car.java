package com.wellnwill.jm3006.spring.di.noxml.eg03.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

//	constructor injection
	@Autowired
	public Car(@Qualifier("mahindraEngine") Engine engine) {
		this.engine = engine;
		System.out.println("Car is being built with engine.");
		engine.start();
	}

	public void driveTheCar() {
		System.out.println("Driving the car....");
	}

}
