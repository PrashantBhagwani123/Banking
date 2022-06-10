package com.banking.loan.dao;

import com.banking.loan.entity.UserLoanDetail;
import com.banking.loan.requestMapper.UserLoanRequestMapper;

public interface UserLoanDao {

	public String applyLoan(UserLoanRequestMapper userLoanRequestMapper, UserLoanDetail userLoanDetail);
}
