package com.mum.labs.lab4.payrollCalculation;

public class Salaried extends Employee {
	private double salary;
	
	public Salaried(double salary)
	{
		this.salary = salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public double calcGrossPay()
	{
		return salary;
	}
}

