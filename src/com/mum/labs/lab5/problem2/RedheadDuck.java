package com.mum.labs.lab5.problem2;

public class RedheadDuck extends Duck{
	public RedheadDuck(){
		setFlyBehaviour();
		setQuackBehaviour();
	}
	
	@Override
	public void display(){
		System.out.println("	displaying");
	}
	
	public void setFlyBehaviour(){
		super.setFlyBehaviour(new FlyWithWings());
	}
	
	public void setQuackBehaviour(){
		super.setQuackBehaviour(new Quack());
	}
	
}
