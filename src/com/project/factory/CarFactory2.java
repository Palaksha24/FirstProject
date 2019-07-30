package com.project.factory;

import com.project.bean.Car;

public class CarFactory2 {
	public  String carName;

	public  void setCarName(String carName) {
		this.carName = carName;
	}

	public  Car getInstance() throws Exception {
		return (Car) Class.forName(carName).newInstance();
	}	
}
