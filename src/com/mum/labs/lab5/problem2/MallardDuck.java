package com.mum.labs.lab5.problem2;

public class MallardDuck extends Duck {
	public MallardDuck(){
		super.setFlyBehaviour(new FlyWithWings());
		setQuackBehaviour();
	}
	
	public void setFlyBehaviour(){
		
	}
	
	public void setQuackBehaviour(){
		super.setQuackBehaviour(new Quack());
	}
	
	@Override
	public void display(){
		System.out.println("	display");
	}	
}
