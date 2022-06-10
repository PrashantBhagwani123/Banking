package com.banking.account.dao;

import com.banking.account.entity.Branch;
import com.banking.account.entity.UserAccountDetail;
import com.banking.account.requestMapper.UserAccountDetailMapper;

public interface UserAccountDao {

	public Branch getBranch(String state, String city);

	public boolean accountAndCustomerCheck(String accountNumber, String customerId);

	public String addAccount(UserAccountDetailMapper userAccountDetailMapper, UserAccountDetail userAccountDetail);
}
