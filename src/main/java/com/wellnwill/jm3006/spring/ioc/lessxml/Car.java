package com.wellnwill.jm3006.spring.ioc.lessxml;

import org.springframework.stereotype.Component;

@Component("abc")
public class Car {

	public Car() {
		System.out.println("Car is being created.");
	}

	public void driveTheCar() {
		System.out.println("Driving the car...");
	}

}
