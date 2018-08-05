package com.wellnwill.jm3006.spring.di.di01;

public class SonyMusicSystem implements MusicSystem {

	public SonyMusicSystem() {
		System.out.println("SonyMusicSystem is being built.");
	}

	public void playMusic() {
		System.out.println("Playing music on SonyMusicSystem");
	}

}
