package com.mum.labs.lab5.problem2;

public class Duck {
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
	
	public void display(){}
	
	public void swim(){
		System.out.println("	swimming");
	}
	
	public void fly(){
		System.out.println(getFlyBehaviour().fly());
	}
	
	public void quack(){
		System.out.println(getQuackBehaviour().quack());
	}
	
	public FlyBehaviour getFlyBehaviour(){
		return this.flyBehaviour;
	}	
	
	public QuackBehaviour getQuackBehaviour(){
		return this.quackBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public void setQuackBehaviour(QuackBehaviour quackBehaviour){
		this.quackBehaviour = quackBehaviour;
	}
}
