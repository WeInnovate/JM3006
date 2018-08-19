package com.wellnwill.jm3006.spring.spel.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/wellnwill/jm3006/spring/spel/xml/spring-spel.xml");

		Car car = (Car) context.getBean("car");
		System.out.println(car);
	}

}
