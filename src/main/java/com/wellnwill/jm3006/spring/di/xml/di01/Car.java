package com.wellnwill.jm3006.spring.di.xml.di01;

public class Car {

	private MusicSystem musicSystem;
	
	public Car(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
		System.out.println("Car is being created.");
	}

	public void driveTheCar() {
		System.out.print("Driving the car... and...");
		musicSystem.playMusic();
	}

}
