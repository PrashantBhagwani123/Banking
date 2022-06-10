package com.banking.account.responseHandler;

public class BranchDetailsNotFound extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public BranchDetailsNotFound() {

	}

	public BranchDetailsNotFound(String message) {
		super(message);
	}

	public BranchDetailsNotFound(Throwable cause) {
		super(cause);

	}

	public BranchDetailsNotFound(String message, Throwable cause) {
		super(message, cause);
	}

	public BranchDetailsNotFound(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
