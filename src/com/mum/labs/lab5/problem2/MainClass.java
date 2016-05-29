package com.mum.labs.lab5.problem2;

public class MainClass {
	public static void main(String[] args){
		Duck ducks[] = {new MallardDuck(),new RedheadDuck(),new RubberDuck(),new DecoyDuck()};
		for(Duck d : ducks){
			System.out.println(d.getClass().getSimpleName()+":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
	}
}
