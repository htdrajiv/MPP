package com.mum.labs.lab5.problem2;

public class MallardDuck extends Duck {
	public MallardDuck(){
		setFlyBehaviour();
		setQuackBehaviour();
	}
	
	public void setFlyBehaviour(){
		super.setFlyBehaviour(new FlyWithWings());
	}
	
	public void setQuackBehaviour(){
		super.setQuackBehaviour(new Quack());
	}
	
	@Override
	public void display(){
		System.out.println("	display");
	}	
}
