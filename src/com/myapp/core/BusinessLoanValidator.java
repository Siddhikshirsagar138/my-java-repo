package com.myapp.core;

public class BusinessLoanValidator implements LoanValidator {

	public boolean isValid(double amount) {
		// TODO Auto-generated method stub
		if(amount>=10000)
			return true;
		return false;
	}

}
