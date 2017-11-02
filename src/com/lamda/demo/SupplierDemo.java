package com.lamda.demo;

import java.util.function.Supplier;

public class SupplierDemo {
	
	
	static void driveVehicle(Supplier<? extends Vehicle> supplier) {
		Vehicle vehicle = supplier.get();
		vehicle.drive();
	}

	public static void main(String[] args) {
		driveVehicle(() -> new Vehicle());
	}

}
