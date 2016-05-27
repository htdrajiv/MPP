package com.mum.labs.lab4.payrollCalculation;

import java.util.Date;

public class Order {
	private int orderNo;
	private Date orderDate;
	private double orderAmount;
	
	public Date getOrderDate(){
		return this.orderDate;
	}
	
	public double getOrderAmount(){
		return this.orderAmount;
	}
	
	public Order(int orderno, Date orderdate, double orderamount)
	{
		this.orderNo= orderno;
		this.orderDate= orderdate;
		this.orderAmount=orderamount;
	}
}
