package com.mum.labs.lab5.problem4.personbirthinfo;

public class PersonAndBirthInfoImplementation implements PersonAndBirthInfo{
	private Person person;
	private BirthInfo birthInfo;
	@Override
	public Person getPerson() {
		return person;
	}

	@Override
	public BirthInfo getBirthInfo() {
		return birthInfo;
	}
	
	// no modifier makes this constructor package accessible only
	PersonAndBirthInfoImplementation(Person person,BirthInfo birthInfo){
		this.person = person;
		this.birthInfo = birthInfo;
	}

}
