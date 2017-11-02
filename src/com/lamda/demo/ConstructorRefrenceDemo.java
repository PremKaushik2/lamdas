package com.lamda.demo;

import java.util.function.Supplier;

public class ConstructorRefrenceDemo {

	
	static void driveVehicle(Supplier<Vehicle> supplier) {
		Vehicle vehicle = supplier.get();
		vehicle.drive();
	}

	public static void main(String[] args) {
		driveVehicle(Vehicle::new);
	}
}
