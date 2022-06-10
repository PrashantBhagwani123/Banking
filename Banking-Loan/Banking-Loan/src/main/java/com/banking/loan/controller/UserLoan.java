package com.banking.loan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.loan.loanResponseHandler.LoanResp;
import com.banking.loan.requestMapper.UserLoanRequestMapper;

@RestController
public interface UserLoan {

	@PostMapping("/applyLoan")
	public ResponseEntity<LoanResp> applyLoan(UserLoanRequestMapper userLoanRequestMapper);
}
