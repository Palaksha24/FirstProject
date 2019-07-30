package com.project.factory;

import com.project.bean.Car;

public class CarFactory {

	public static String carName;

	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}

	public static Car getInstance() throws Exception {
		return (Car) Class.forName(carName).newInstance();
	}	

}
