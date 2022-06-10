package com.banking.account.responseHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	AccountResp accountResp = new AccountResp();
	AccountResp.StatusDO statusDO = new AccountResp().new StatusDO();

	@ExceptionHandler
	public ResponseEntity<AccountResp> handleException(AccountNotCreatedException exc) {
		statusDO.setStatusCode(-1);
		statusDO.setStatusMsg(exc.getMessage());
		accountResp.setStatusDO(statusDO);
		accountResp.setRequestType("Account Open");
		return new ResponseEntity<>(accountResp, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<AccountResp> handleException(BranchDetailsNotFound exc) {
		statusDO.setStatusCode(-1);
		statusDO.setStatusMsg(exc.getMessage());
		accountResp.setStatusDO(statusDO);
		accountResp.setRequestType("getBranch");
		return new ResponseEntity<>(accountResp, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<AccountResp> handleException(Exception exc) {
		statusDO.setStatusCode(-1);
		statusDO.setStatusMsg(exc.getMessage());
		accountResp.setStatusDO(statusDO);
		accountResp.setRequestType("");
		return new ResponseEntity<>(accountResp, HttpStatus.BAD_REQUEST);

	}

}
