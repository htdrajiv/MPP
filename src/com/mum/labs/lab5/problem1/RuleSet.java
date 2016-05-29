package com.mum.labs.lab5.problem1;

import java.awt.Component;

import com.mum.labs.lab5.problem1.rulesets.*;

public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
