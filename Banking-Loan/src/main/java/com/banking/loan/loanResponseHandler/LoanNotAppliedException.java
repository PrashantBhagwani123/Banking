package com.banking.loan.loanResponseHandler;

public class LoanNotAppliedException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public LoanNotAppliedException() {

	}

	public LoanNotAppliedException(String message) {
		super(message);
	}

	public LoanNotAppliedException(Throwable cause) {
		super(cause);

	}

	public LoanNotAppliedException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoanNotAppliedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}


}
