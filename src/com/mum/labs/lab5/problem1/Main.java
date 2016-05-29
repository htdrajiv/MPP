package com.mum.labs.lab5.problem1;

import com.mum.labs.lab5.problem1.windows.AddressWindow;
import com.mum.labs.lab5.problem1.windows.CustomerProfileWindow;

public class Main {

	public static void main(String[] args) {
		AddressWindow addWin = new AddressWindow();	
		addWin.setVisible(true);
		CustomerProfileWindow custWin = new CustomerProfileWindow();	
		custWin.setVisible(true);

	}

}
