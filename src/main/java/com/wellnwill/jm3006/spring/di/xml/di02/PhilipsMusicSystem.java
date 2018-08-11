package com.wellnwill.jm3006.spring.di.xml.di02;

public class PhilipsMusicSystem implements MusicSystem {

	public PhilipsMusicSystem() {
		System.out.println("PhilipsMusicSystem is being built.");
	}

	public void playMusic() {
		System.out.println("Playing music on PhilipsMusicSystem");
	}

}
