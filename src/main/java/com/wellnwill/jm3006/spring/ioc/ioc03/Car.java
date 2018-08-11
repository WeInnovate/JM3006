package com.wellnwill.jm3006.spring.ioc.ioc03;

public class Car {

	private Long modelNumber;

	private String name;

	private String color;

	private boolean isAirBagsPresent;

	public Car(Long modelNumber, String name, boolean isAirBagsPresent) {
		this.modelNumber = modelNumber;
		this.name = name;
		this.isAirBagsPresent = isAirBagsPresent;
		System.out.println("Car is being created.");
	}

	public Car(String color, Long modelNumber, boolean isAirBagsPresent) {
		this.modelNumber = modelNumber;
		this.color = color;
		this.isAirBagsPresent = isAirBagsPresent;
		System.out.println("Car is being created.");
	}

	public void driveTheCar() {
		System.out.println("Driving the " + name);
	}

}
