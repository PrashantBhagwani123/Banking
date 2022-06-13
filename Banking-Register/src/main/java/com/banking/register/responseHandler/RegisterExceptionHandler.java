package com.banking.register.responseHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class RegisterExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<RegisterResp> handleException(UserNotRegistered exc) {
		
		RegisterResp.StatusDO statusDO= new RegisterResp().new StatusDO();
		statusDO.setStatusCode(-1);
		statusDO.setStatusMsg(exc.getMessage());
		RegisterResp registerResp= new RegisterResp();
		registerResp.setStatusDO(statusDO);
		registerResp.setRequestType("User Registration");
		return new ResponseEntity<>(registerResp, HttpStatus.NOT_FOUND);

	}

}
