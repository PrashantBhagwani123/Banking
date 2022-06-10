package com.banking.loan.controller.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import com.banking.loan.controller.UserLoan;
import com.banking.loan.entity.UserLoanDetail;
import com.banking.loan.loanResponseHandler.LoanResp;
import com.banking.loan.requestMapper.UserLoanRequestMapper;
import com.banking.loan.service.impl.UserLoanServiceImpl;

@Component
public class UserLoanDetailController implements UserLoan {

	
	@Value("${loanAccountNumber.constant.accountNumber}")
	private String accountNumber;
	
	@Autowired
	UserLoanServiceImpl userLoanServiceImpl;
	
	@Override
	public ResponseEntity<LoanResp> applyLoan(@RequestBody UserLoanRequestMapper userLoanRequestMapper) {
		LoanResp loanResp= new LoanResp();
		UserLoanDetail userLoanDetail = new UserLoanDetail();
		userLoanDetail.setLoanAmount(userLoanRequestMapper.getLoanAmount());
		userLoanDetail.setCustomerName(userLoanRequestMapper.getCustomerName());
		userLoanDetail.setDueDate(userLoanRequestMapper.getDueDate());
		userLoanDetail.setIssueDate(new Date());
		userLoanDetail.setLoanAccountNumber(randomNumberGenerator(accountNumber));

	    if(userLoanServiceImpl.loanApply(userLoanRequestMapper, userLoanDetail)=="Success") {
	    	LoanResp.StatusDO statusDO= loanResp.new StatusDO();
			statusDO.setStatusCode(1);
			statusDO.setStatusMsg("Loan Application Applied Successfully");
			loanResp.setStatusDO(statusDO);
			loanResp.setRequestType("applyLoan");
	    }
	    
	    return new ResponseEntity<>(loanResp, HttpStatus.CREATED);
	}

	public String randomNumberGenerator(String num) {

		String commonNum, mathRandom, randomNum;
		commonNum = num;

		double d = Math.random();
		d = d * 1000000.0;
		int i = (int) d;

		mathRandom = String.valueOf(i);
		randomNum = commonNum + mathRandom;
		return randomNum;
	}

}
