package com.mum.labs.lab5.problem1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import com.mum.labs.lab5.problem1.AddrWindow;
import com.mum.labs.lab5.problem1.RuleSet;
import com.mum.labs.lab5.problem1.windows.AddressWindow;
import com.mum.labs.lab5.problem1.windows.CustomerProfileWindow;

final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {
		map.put(AddrWindow.class, new AddressRuleSet());
		map.put(CustomerProfileWindow.class, new CustomerProfileRuleSet());
	}
	public static RuleSet getRuleSet(Component c) {
		Class<? extends Component> cl = c.getClass();
		if(!map.containsKey(cl)) {
			throw new IllegalArgumentException("No RuleSet found for this Component");
		}
		return map.get(cl);
	}
}
