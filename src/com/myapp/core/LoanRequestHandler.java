package com.myapp.core;
public class LoanRequestHandler {

	private double amount;

 public LoanRequestHandler(double amount) {
     super();
     this.amount = amount;
}

	public String applyLoan(LoanValidator loanValidator) {
		if(loanValidator.isValid(amount))
			return "Loan Aproved";
		else
			return "Loan Rejected";
	}
}
