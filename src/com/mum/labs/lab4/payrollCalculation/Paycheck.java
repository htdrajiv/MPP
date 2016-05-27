package com.mum.labs.lab4.payrollCalculation;

public final class Paycheck {
private double grossPay;
private double fica=0.23;
private double state=0.05;
private double local=0.01;
private double medicare=0.03;
private double socialSecurity=0.075;

public Paycheck(double grosspay)
{
	this.grossPay =grosspay;
}

public Paycheck(double grossPay,double fica,double state,double local,double medicare,double socialSecurity){
	this.grossPay = grossPay;
	this.fica = fica;
	this.state = state;
	this.local = local;
	this.medicare = medicare;
	this.socialSecurity = socialSecurity;
}

public void Print()
{
	System.out.println("Total Net pay is "+getNetPay() );
}

public double getNetPay()
{
	double netpay = grossPay - (fica*grossPay + state*grossPay + local*grossPay + medicare*grossPay + socialSecurity*grossPay);
	return netpay;
}
}
