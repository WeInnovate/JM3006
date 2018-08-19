package com.wellnwill.jm3006.spring.di.noxml.eg03.setter;

import org.springframework.stereotype.Component;

@Component
public class AshokaLeyLandEngine implements Engine {

	public AshokaLeyLandEngine() {
		System.out.println(this.getClass().getSimpleName() + " is being built");
	}

	public void start() {
		System.out.println(this.getClass().getSimpleName() + " has been started.");
	}
}
