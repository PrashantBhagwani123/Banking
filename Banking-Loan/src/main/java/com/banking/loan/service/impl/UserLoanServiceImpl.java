package com.banking.loan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.loan.dao.impl.UserLoanDaoImpl;
import com.banking.loan.entity.UserLoanDetail;
import com.banking.loan.requestMapper.UserLoanRequestMapper;
import com.banking.loan.service.UserLoanService;

@Service
public class UserLoanServiceImpl implements UserLoanService {

	@Autowired
	UserLoanDaoImpl userLoanDaoImpl;
	
	@Override
	public String loanApply(UserLoanRequestMapper userLoanRequestMapper, UserLoanDetail userLoanDetail) {
		
		return userLoanDaoImpl.applyLoan(userLoanRequestMapper, userLoanDetail);
	}

}
