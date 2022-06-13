package com.banking.account.responseHandler;

public class AccountNotCreatedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public AccountNotCreatedException() {

	}

	public AccountNotCreatedException(String message) {
		super(message);
	}

	public AccountNotCreatedException(Throwable cause) {
		super(cause);

	}

	public AccountNotCreatedException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountNotCreatedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
