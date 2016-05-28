package com.mum.labs.lab5.problem3;

public final class Triangle implements Shape {
	private final double base;
	private final double height;
	
	public Triangle(double base,double height){
		this.base = base;
		this.height = height;
	}
	
	public double getBase(){
		return this.base;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	@Override
	public double computeArea(){
		return ( 1/2 ) * this.base * this.height;
	}
}
