package com.lamda.demo;

public class FourDObject {
	int xAxis;
	int yAxis;
	int zAxis;
	int	tAxis;
	
	public FourDObject(int xAxis, int yAxis, int zAxis, int tAxis) {
		System.out.println("In the constructor:- "+xAxis+" "+yAxis+" "+zAxis+" "+tAxis);
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.zAxis = zAxis;
		this.tAxis = tAxis;
	}


}
