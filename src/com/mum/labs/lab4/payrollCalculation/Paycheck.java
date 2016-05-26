package com.mum.labs.lab4.payrollCalculation;

public class Paycheck {
	private Double grossPay;
	private Double fica = 0.23;
	private Double state = 0.05;
	private Double local = 0.01;
	private Double medicare = 0.03;
	private Double socialSecurity = 0.075;
	
	public Paycheck(Double grossPay){
		this.grossPay = grossPay;
	}
	
	public Paycheck(Double grossPay,Double fica,Double state,
			Double local,Double medicare,Double socialSecurity){
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}
	
	public Double getNetPay(){
		return 0.0;
	}
	
	public void print(){
		
	}

}
