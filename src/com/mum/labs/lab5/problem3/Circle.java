package com.mum.labs.lab5.problem3;

public final class Circle implements Shape {
	private final double radius;
	private final double PI = 3.14;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	@Override
	public double computeArea(){
		return PI * radius * radius;
	}
}
