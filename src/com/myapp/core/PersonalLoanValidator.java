package com.myapp.core;

public class PersonalLoanValidator implements LoanValidator {

	@Override
	public boolean isValid(double amount) {
		// TODO Auto-generated method stub
		if(amount>=5000)
			return true;
		return false;
	}

}
