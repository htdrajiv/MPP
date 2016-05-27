package com.mum.labs.lab4.payrollCalculation;

public abstract class Employee {
private int empID;

public void print()
{
	
}
public Paycheck calcCompensation(int month,int year)
{
	return new Paycheck(calcGrossPay());
}

public abstract double calcGrossPay();

}
