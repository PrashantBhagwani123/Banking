package com.banking.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.account.dao.impl.UserAccountDaoImpl;
import com.banking.account.entity.Branch;
import com.banking.account.entity.UserAccountDetail;
import com.banking.account.requestMapper.UserAccountDetailMapper;
import com.banking.account.service.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	UserAccountDaoImpl userAccountDaoImpl;

	@Override
	public Branch getBranch(String state, String city) {

		return userAccountDaoImpl.getBranch(state, city);
	}

	@Override
	public String addAccount(UserAccountDetailMapper userAccountDetailMapper, UserAccountDetail userAccountDetail) {
		return userAccountDaoImpl.addAccount(userAccountDetailMapper, userAccountDetail);

	}

	@Override
	public boolean accountAndCustomerCheck(String accountId, String customerId) {
		return userAccountDaoImpl.accountAndCustomerCheck(accountId, customerId);
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
