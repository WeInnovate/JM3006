package com.wellnwill.jm3006.spring.di.noxml.eg02.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wellnwill.jm3006.spring.di.noxml.eg02.setter.Car;
import com.wellnwill.jm3006.spring.di.noxml.eg02.setter.Engine;

@Configuration
@ComponentScan(basePackages = "com.wellnwill.jm3006.spring.di.noxml.eg02.setter")
public class MyConfiguration {

	@Bean("car")
	@Autowired
	public Car getCar(Engine engine) {
		Car car = new Car();
		car.setEngine(engine);
		return car;
	}

	@Bean("engine")
	public Engine getEngine() {
		return new Engine();
	}
}
