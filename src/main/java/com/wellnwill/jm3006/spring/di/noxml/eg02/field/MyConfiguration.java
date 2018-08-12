package com.wellnwill.jm3006.spring.di.noxml.eg02.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wellnwill.jm3006.spring.di.noxml.eg02.field.Car;
import com.wellnwill.jm3006.spring.di.noxml.eg02.field.Engine;

@Configuration
public class MyConfiguration {
	
	@Bean("car")
	@Autowired
	public Car getCar(Engine engine) {
		Car car = new Car();
		car.engine = engine;
		return car;
	}

	@Bean("engine")
	public Engine getEngine() {
		return new Engine();
	}
}
