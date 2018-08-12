package com.wellnwill.jm3006.spring.ioc.noxml.eg01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Car car = (Car) context.getBean("myCar");
		car.driveTheCar();
	}

}
