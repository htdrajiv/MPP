package com.mum.labs.lab5.problem4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.mum.labs.lab5.problem4.personbirthinfo.PersonAndBirthInfo;
import com.mum.labs.lab5.problem4.personbirthinfo.PersonBirthInfoFactory;

public class MainClass {
	public static void main(String[] args){
		List<PersonAndBirthInfo> personAndBirth 
			= Arrays.asList(
					PersonBirthInfoFactory.createPersonAndBirthInfo("person1", LocalDate.of(2010, 02, 12)),
					PersonBirthInfoFactory.createPersonAndBirthInfo("person2", LocalDate.of(2010, 11, 9)),
					PersonBirthInfoFactory.createPersonAndBirthInfo("person3", LocalDate.of(2011, 04, 25))
					);	
		
		for(PersonAndBirthInfo pbi : personAndBirth){
			System.out.println("Person Name = "+pbi.getPerson().getName()+" and Person dob = "+pbi.getBirthInfo().getDateOfBirth());
		}
	}
}
