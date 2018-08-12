package com.wellnwill.jm3006.spring.di.lessxml.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/wellnwill/jm3006/spring/di/lessxml/field/spring-di.xml");
		Car car = (Car) context.getBean("car");
		car.driveTheCar();
	}

}
