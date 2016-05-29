package com.mum.labs.lab5.problem1.rulesets;

import java.awt.Component;

import com.mum.labs.lab5.problem1.AddrWindow;
import com.mum.labs.lab5.problem1.RuleSet;
// import com.mum.labs.lab5.problem1.windows.AddressWindow;

final public class AddressRuleSet implements RuleSet {
	//package level access
	AddressRuleSet() {}
	@Override
	public void applyRules(Component ob) throws RuleException {
		AddrWindow addr = (AddrWindow)ob;
		nonEmptyRule(addr);
		numericRule(addr);
		fixLengthRule(addr);
		exactCharacterRule(addr);
		checkIdWithZip(addr);
		//comment 
		// throw new RuleException("An address rule has been violated!");

	}

	private void numericRule(AddrWindow addr) throws RuleException {
		String zip = addr.getZipValue();
		String id  = addr.getIdValue();
		try {
			Integer.parseInt(zip);
			Integer.parseInt(id);
		} catch(NumberFormatException e) {
			throw new RuleException("Zip must be numeric");
		}
	}

	private void nonEmptyRule(AddrWindow addr) throws RuleException {
		try{
			String result = ""+addr.getCityValue().isEmpty()+addr.getStreetValue().isEmpty()+addr.getZipValue().isEmpty()+
					addr.getIdValue().isEmpty()+addr.getStateValue();
			if(result.contains("true")) throw new NullPointerException();
		}catch(NullPointerException e){
			throw new RuleException("All fields are required");
		}
	}

	private void fixLengthRule(AddrWindow addr) throws RuleException{
		int len = addr.getZipValue().length();
		int len1 = addr.getStateValue().length();
		if(len!=5) throw new RuleException("Zip must of length 5");
		if(len1!=2) throw new RuleException("State must be of length 2");
	}

	private void exactCharacterRule(AddrWindow addr) throws RuleException {
		String state = addr.getStateValue();
		for(int i=0;i<state.length();i++){
			if(!Character.isUpperCase(state.charAt(i))) throw new RuleException("State value must contains Capital letters");
		}
	}

	private void checkIdWithZip(AddrWindow addr) throws RuleException{
		if(addr.getIdValue().toString().equals(addr.getZipValue().toString())) throw new RuleException("Zip code and Id matches");
	}

}
