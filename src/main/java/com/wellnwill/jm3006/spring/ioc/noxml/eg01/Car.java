package com.wellnwill.jm3006.spring.ioc.noxml.eg01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myCar")
@Scope("prototype")
public class Car {

	public Car() {
		System.out.println("Car is being created.");
	}

	public void driveTheCar() {
		System.out.println("Driving the car...");
	}

}
