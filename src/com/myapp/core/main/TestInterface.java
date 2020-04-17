package com.myapp.core.main;
import com.myapp.core.LoanValidator;

import com.myapp.core.BusinessLoanValidator;
import com.myapp.core.LoanRequestHandler;
import com.myapp.core.PersonalLoanValidator;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LoanValidator businessLoanValidator = new BusinessLoanValidator();
			LoanValidator personalLoanValidator = new PersonalLoanValidator();
			
			LoanRequestHandler handler = new LoanRequestHandler(7500);
			System.out.println(handler.applyLoan(personalLoanValidator));
			System.out.println(handler.applyLoan(businessLoanValidator));
			
	}

}
