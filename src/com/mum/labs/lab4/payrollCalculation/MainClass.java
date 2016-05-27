package com.mum.labs.lab4.payrollCalculation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Employee emp1 = new Hourly(10,2000.0);
		Employee emp2 = new Salaried(20000);
		
		ArrayList<Order> orders = new ArrayList<Order>();
		orders.add(new Order(1,new Date(),100));
		orders.add(new Order(2,new Date(),100));
		
		Employee emp3 = new Comissioned(100,orders);
		
		System.out.println("The net pay of Hourly Employee "+emp1.calcCompensation(5, 2016).getNetPay());
		System.out.println("The net pay of Salaried Employee "+ emp2.calcCompensation(5, 2016).getNetPay());
		System.out.println("The net pay of Commissioned Employee"+ emp3.calcCompensation(5, 2016).getNetPay());

	}

}
