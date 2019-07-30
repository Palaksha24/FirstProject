package com.project.factory;

import org.springframework.beans.factory.FactoryBean;

import com.project.bean.Car;

public class CarFactoryBF implements FactoryBean<Car>{
	private String carName;
	
	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public Car getObject() throws Exception {
		Car c = (Car) Class.forName(carName).newInstance();
		return c;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}	
}
