package com.banking.loan.loanResponseHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LoanExceptionHandler {

	
	LoanResp loanResp = new LoanResp();
	LoanResp.StatusDO statusDO = new LoanResp().new StatusDO();
	
	@ExceptionHandler
	public ResponseEntity<LoanResp> handleException(LoanNotAppliedException exc) {
		statusDO.setStatusCode(-1);
		statusDO.setStatusMsg(exc.getMessage());
		loanResp.setStatusDO(statusDO);
		loanResp.setRequestType("applyLoan");
		return new ResponseEntity<>(loanResp, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<LoanResp> handleException(Exception exc) {
		statusDO.setStatusCode(-1);
		statusDO.setStatusMsg(exc.getMessage());
		loanResp.setStatusDO(statusDO);
		loanResp.setRequestType("applyLoan");
		return new ResponseEntity<>(loanResp, HttpStatus.BAD_REQUEST);

	}

}
