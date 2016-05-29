package com.mum.labs.lab5.problem2;

public class RubberDuck extends Duck{
	public RubberDuck(){
		setFlyBehaviour();
		setQuackBehaviour();
	}
	
	@Override
	public void display(){
		System.out.println("	displaying");
	}
	
	public void setFlyBehaviour(){
		super.setFlyBehaviour(new CannotFly());
	}
	
	public void setQuackBehaviour(){
		super.setQuackBehaviour(new Squeak());
	}
	
}
