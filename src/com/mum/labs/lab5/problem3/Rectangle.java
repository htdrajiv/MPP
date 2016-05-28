package com.mum.labs.lab5.problem3;

public final class Rectangle implements Shape{
	private final double length;
	private final double breadth;
	
	public Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getLength(){
		return this.length;
	}
	
	public double getBreadth(){
		return this.breadth;
	}
	
	@Override
	public double computeArea(){
		return this.length * this.breadth;
	}
}
