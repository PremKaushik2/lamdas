package com.lamda.demo;

public class Ball {
	public int weight;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String color;
	public Ball(int size, String color) {
		super();
		this.weight = size;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Ball [weight=" + weight + ", color=" + color + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
