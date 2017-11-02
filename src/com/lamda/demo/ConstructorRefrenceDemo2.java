package com.lamda.demo;

public class ConstructorRefrenceDemo2 {
	
	static void createNewObj(CustomConstructorInterface cc) {
		FourDObject fd = cc.apply(10, 10, 10, 10);
		
	}

	public static void main(String[] args) {
		createNewObj(FourDObject::new);
	}

}
