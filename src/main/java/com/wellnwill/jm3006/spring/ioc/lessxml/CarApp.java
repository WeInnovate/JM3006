package com.wellnwill.jm3006.spring.ioc.lessxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
//		Car car = new Car();

//		ask from spring to give the car
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/wellnwill/jm3006/spring/ioc/lessxml/spring-ioc.xml");
		Car car = (Car)context.getBean("abc");
		car.driveTheCar();
		
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext(
				"com/wellnwill/jm3006/spring/ioc/lessxml/spring-ioc.xml");
		Engine engine = (Engine)context2.getBean("engine");
		engine.start();
	}

}
