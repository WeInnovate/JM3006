package com.wellnwill.jm3006.spring.di.noxml.eg03.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Car car = (Car) context.getBean("car");
		car.driveTheCar();
	}

}
