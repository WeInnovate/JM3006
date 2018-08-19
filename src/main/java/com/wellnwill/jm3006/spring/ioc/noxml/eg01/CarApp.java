package com.wellnwill.jm3006.spring.ioc.noxml.eg01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wellnwill.jm3006.spring.ioc.noxml.eg01.Car;

public class CarApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Car car = (Car) context.getBean("myCar");
		Car car2 = (Car)context.getBean("myCar");
		Car car3 = (Car)context.getBean("myCar");
		car.driveTheCar();
		System.out.println(car.hashCode() + " "+ car2.hashCode()+" "+ car3.hashCode());
	}

}
