package com.wellnwill.jm3006.spring.ioc.xml.ioc01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
//		Car car = new Car();

//		ask from spring to give the car
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/wellnwill/jm3006/spring/ioc/xml/ioc01/spring-ioc.xml");
		Car car = (Car)context.getBean("car");
		Car car2 = (Car)context.getBean("car");
		Car car3 = (Car)context.getBean("car");
		car.driveTheCar();
		
		System.out.println(car.hashCode() + " "+ car2.hashCode()+" "+ car3.hashCode());
	}

}
