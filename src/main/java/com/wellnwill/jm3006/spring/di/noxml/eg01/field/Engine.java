package com.wellnwill.jm3006.spring.di.noxml.eg01.field;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine is being built");
	}

	public void start() {
		System.out.println("Engine started.");
	}
}
