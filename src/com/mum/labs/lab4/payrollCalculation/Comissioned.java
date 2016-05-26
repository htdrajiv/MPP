package com.mum.labs.lab4.payrollCalculation;

import java.util.ArrayList;
import java.util.Calendar;

public class Comissioned extends Employee{
	Double comission;
	Double baseSalary;
	
	ArrayList<Order> order;
	
	public Double calcGrossPay(int month){		
		Double totalGrossPayableAmount = 0.0;
		totalGrossPayableAmount += this.baseSalary;
		totalGrossPayableAmount += totalOrderForThisMonth(month);
		return totalGrossPayableAmount;
	}
	
	@Override
	public Paycheck calcCompensation(int month,int year){
//		Double totalOrderAmount = totalOrderForThisMonth(month,year);
		return new Paycheck(calcGrossPay(month));
	}
	
	public Double totalOrderForThisMonth(int month,int year){
		Double totalOrderAmount = 0.0;
		Calendar cal = Calendar.getInstance();
		for(Order o : order){
			cal.setTime(o.orderDate);
			if(cal.MONTH==month && cal.YEAR==year){
				totalOrderAmount += o.orderAmount;
			}				
		}
		return totalOrderAmount;
	}
	
	public Double totalOrderForThisMonth(int month){
		Double totalOrderAmount = 0.0;
		Calendar cal = Calendar.getInstance();
		int currentMonth = month;
		int currentYear = cal.YEAR;
		
		for(Order o : order){
			cal.setTime(o.orderDate);
			if(cal.MONTH==currentMonth && cal.YEAR==currentYear){
				totalOrderAmount += o.orderAmount;
			}				
		}
		return totalOrderAmount;
	}
 
}
