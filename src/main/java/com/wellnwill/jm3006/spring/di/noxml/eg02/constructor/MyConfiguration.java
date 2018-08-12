package com.wellnwill.jm3006.spring.di.noxml.eg02.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@Bean("car")
	@Autowired
	public Car getCar(Engine engine) {
		return new Car(engine);
	}

	@Bean("engine")
	public Engine getEngine() {
		return new Engine();
	}

}
