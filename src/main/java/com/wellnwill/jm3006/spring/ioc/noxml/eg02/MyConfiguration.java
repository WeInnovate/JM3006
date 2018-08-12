package com.wellnwill.jm3006.spring.ioc.noxml.eg02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@Bean("myCar")
	public Car getCar() {
		return new Car();
	}
}
