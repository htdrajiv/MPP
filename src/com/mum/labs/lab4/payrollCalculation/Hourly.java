package com.mum.labs.lab4.payrollCalculation;

public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;
	
	public Hourly(double hWage, double hpWeek)
	{
		hourlyWage = hWage;
		hoursPerWeek = hpWeek;
	}
	
	public void setHourlyWage(double hourlyWage){
		this.hourlyWage = hourlyWage;
	}
	
	public void setHoursPerWeek(double hoursPerWeek){
		this.hoursPerWeek = hoursPerWeek;
	}
	
	public double calcGrossPay()
	{
		return hourlyWage * hoursPerWeek * 4;
	}
}
