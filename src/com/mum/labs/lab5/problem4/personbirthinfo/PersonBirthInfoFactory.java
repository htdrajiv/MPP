package com.mum.labs.lab5.problem4.personbirthinfo;

import java.time.LocalDate;

public class PersonBirthInfoFactory {
	
	public static PersonAndBirthInfo createPersonAndBirthInfo(String personName,LocalDate dateOfBirth){
		Person person = new Person(personName);		
		BirthInfo birthInfo = new BirthInfo(dateOfBirth);
		
		person.setBirthInfo(birthInfo);
		birthInfo.setPerson(person);
		
		return new PersonAndBirthInfoImplementation(person, birthInfo);
	}

}
