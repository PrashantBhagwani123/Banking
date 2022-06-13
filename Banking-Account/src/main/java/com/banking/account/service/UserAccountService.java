package com.banking.account.service;

import com.banking.account.entity.Branch;
import com.banking.account.entity.UserAccountDetail;
import com.banking.account.requestMapper.UserAccountDetailMapper;

public interface UserAccountService {

	public Branch getBranch(String state, String city);
	
	public boolean accountAndCustomerCheck(String accountId, String customerId);
	
	public String addAccount(UserAccountDetailMapper userAccountDetailMapper, UserAccountDetail userAccountDetail);
}
