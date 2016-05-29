package com.mum.labs.lab5.problem4.personbirthinfo;

import java.time.LocalDate;

public final  class BirthInfo {
	private LocalDate dateOfBirth;
	private Person person;
	
	// no modifier makes package level access only
	BirthInfo(LocalDate dob) {
		this.dateOfBirth = dob;
	}
	// no modifier makes package level access only
	void setPerson(Person person){
		this.person = person;
	}
	
	// no modifier makes package level access only
	public LocalDate getDateOfBirth(){
		return this.dateOfBirth;
	}
	
}
