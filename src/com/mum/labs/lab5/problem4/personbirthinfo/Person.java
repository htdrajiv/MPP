package com.mum.labs.lab5.problem4.personbirthinfo;
public final class Person {
	private String name;
	private BirthInfo birthInfo;
	
	// no modifier makes package accessible only
	Person(String name) {
		this.name = name;
	}
	
	// no modifier makes package accessible only
	void setBirthInfo(BirthInfo birthInfo){
		this.birthInfo = birthInfo;
	}
	
	public String getName(){
		return this.name;
	}
	
	public BirthInfo getBirthInfo(){
		return this.birthInfo;
	}
	
}
