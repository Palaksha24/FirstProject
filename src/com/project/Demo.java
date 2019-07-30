package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.bean.Car;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/project/resource/spring_factory_bean.xml");
		Car car = (Car) context.getBean("cf");
		car.drive();
	}
}
