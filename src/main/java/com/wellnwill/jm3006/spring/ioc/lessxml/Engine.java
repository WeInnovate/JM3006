package com.wellnwill.jm3006.spring.ioc.lessxml;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engin is being constructed.");
	}

	public void start() {
		System.out.println("Engine started");
	}
}
