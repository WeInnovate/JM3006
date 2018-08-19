package com.wellnwill.jm3006.spring.spel.xml;

public class Car {

	private Long modelNumber;

	private String name;

	private boolean isAirBags;

	private Double mileage;

	public Car(Long modelNumber, String name, boolean isAirBags, Double mileage) {
		super();
		this.modelNumber = modelNumber;
		this.name = name;
		this.isAirBags = isAirBags;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", name=" + name + ", isAirBags=" + isAirBags + ", mileage=" + mileage + "]";
	}

}
