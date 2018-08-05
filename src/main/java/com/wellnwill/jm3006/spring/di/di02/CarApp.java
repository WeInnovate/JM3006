package com.wellnwill.jm3006.spring.di.di02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
//		Car car = new Car();

//		ask from spring to give the car
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/wellnwill/jm3006/spring/di/di02/spring-ioc.xml");
		Car car = (Car)context.getBean("car");
		car.driveTheCar();
	}

}
