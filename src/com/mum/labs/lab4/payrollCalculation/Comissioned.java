package com.mum.labs.lab4.payrollCalculation;

import java.util.ArrayList;
import java.util.Calendar;

public class Comissioned extends Employee{
	private double comission;
	private double baseSalary;
	
	ArrayList<Order> order;
	
	public Comissioned(double baseSalary,ArrayList<Order> orders){
		this.baseSalary = baseSalary;
		this.order = orders;
	}
	
	@Override
	public double calcGrossPay(){		
		double totalGrossPayableAmount = 0.0;
		totalGrossPayableAmount += this.baseSalary;
		totalGrossPayableAmount += this.comission;
		return totalGrossPayableAmount;
	}
	
	@Override
	public Paycheck calcCompensation(int month,int year){
		double totalOrderAmount = totalOrderForThisMonth(month,year);
		this.comission = totalOrderAmount * 0.01;
		Paycheck paycheck = new Paycheck(calcGrossPay());
		return paycheck;
	}
	
	public double totalOrderForThisMonth(int month,int year){
		double totalOrderAmount = 0.0;
		Calendar cal = Calendar.getInstance();
		for(Order o : order){			
			cal.setTime(o.getOrderDate());
			if((cal.get(Calendar.MONTH))==month && cal.get(Calendar.YEAR)==year){
				totalOrderAmount += o.getOrderAmount();
			}				
		}
		return totalOrderAmount;
	}
 
}
