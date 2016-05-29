package com.mum.labs.lab5.problem1.rulesets;

import java.awt.Component;

import com.mum.labs.lab5.problem1.RuleSet;
import com.mum.labs.lab5.problem1.windows.AddressWindow;

import com.mum.labs.lab5.problem1.RuleSet;
import com.mum.labs.lab5.problem1.windows.CustomerProfileWindow;

final public class CustomerProfileRuleSet implements RuleSet {
	//package level access
	CustomerProfileRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		CustomerProfileWindow custProf = (CustomerProfileWindow)ob;
		//check data
		
	}

}
