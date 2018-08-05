package com.wellnwill.jm3006.spring.di.di02;

public class Car {

	private MusicSystem musicSystem;
	
	public Car() {
		System.out.println("Car is being created.");
	}

	public void driveTheCar() {
		System.out.print("Driving the car... and...");
	}

	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
		musicSystem.playMusic();
	}
}
