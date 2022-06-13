package com.banking.register.responseHandler;

public class UserNotRegistered extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNotRegistered() {

	}

	public UserNotRegistered(String message) {
		super(message);
	}

	public UserNotRegistered(Throwable cause) {
		super(cause);

	}

	public UserNotRegistered(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNotRegistered(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
