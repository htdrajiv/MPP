package com.mum.labs.lab4.payrollCalculation;

public abstract class Employee {
	int empId;
	
	abstract Double calcGrossPay(int month);
	
	public Paycheck calcCompensation(int month,int year){
		return new Paycheck(calcGrossPay(month));
	}
	
	public void print(){
		
	}
}
