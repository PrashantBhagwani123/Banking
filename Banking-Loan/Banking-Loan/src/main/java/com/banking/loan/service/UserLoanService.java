package com.banking.loan.service;

import com.banking.loan.entity.UserLoanDetail;
import com.banking.loan.requestMapper.UserLoanRequestMapper;

public interface UserLoanService {

	public String loanApply(UserLoanRequestMapper userLoanRequestMapper, UserLoanDetail userLoanDetail);
}
