package com.banking.account.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.banking.account.controller.AccountDetail;
import com.banking.account.entity.Branch;
import com.banking.account.entity.UserAccountDetail;
import com.banking.account.requestMapper.UserAccountDetailMapper;
import com.banking.account.responseHandler.AccountNotCreatedException;
import com.banking.account.responseHandler.AccountResp;
import com.banking.account.service.impl.UserAccountServiceImpl;

@Component
public class AccountDetailController implements AccountDetail {

	@Autowired
	UserAccountServiceImpl userAccountServiceImpl;

	@Value("${account.constant.minBalance}")
	private String minBalance;

	@Value("${accountNumber.constant.account}")
	private String account;

	@Value("${customerId.constant.customer}")
	private String customer;

	@Override
	public ResponseEntity<AccountResp> addUserAccount(@RequestBody UserAccountDetailMapper userAccountDetailMapper) {
		UserAccountDetail userAccountDetail = new UserAccountDetail();
		userAccountDetail.setBranchId(userAccountDetailMapper.getBranchId());
		userAccountDetail.setAccountBalance(minBalance);

		String accountNumber = userAccountServiceImpl.randomNumberGenerator(account);
		String CustomerId = userAccountServiceImpl.randomNumberGenerator(customer);
		if (userAccountServiceImpl.accountAndCustomerCheck(accountNumber, CustomerId)) {
			userAccountDetail.setAccountNumber(accountNumber);
			userAccountDetail.setCustomerId(CustomerId);

		} else {
			throw new AccountNotCreatedException("Account not created");

		}

		AccountResp accountResp = new AccountResp();
		if (userAccountServiceImpl.addAccount(userAccountDetailMapper, userAccountDetail) == "Success") {

			AccountResp.StatusDO statusDO = accountResp.new StatusDO();
			statusDO.setStatusCode(1);
			statusDO.setStatusMsg("Account Created Successfully");
			accountResp.setStatusDO(statusDO);
			accountResp.setRequestType("Account Open");
		}
		return new ResponseEntity<>(accountResp, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<AccountResp> getBranchDetails(@RequestParam("state") String state,
			@RequestParam("city") String city) {

		Branch branch = new Branch();
		AccountResp accountRespBranch = new AccountResp();
		branch = userAccountServiceImpl.getBranch(state, city);
		AccountResp.Data data = accountRespBranch.new Data();
		data.setBranchId(branch.getBranchId());
		data.setBrachName(branch.getBrachName());
		data.setBranchAddress(branch.getBranchAddress());
		data.setBranchCode(branch.getBranchCode());
		accountRespBranch.setData(data);

		AccountResp.StatusDO statusDO = accountRespBranch.new StatusDO();
		statusDO.setStatusCode(0);
		statusDO.setStatusMsg("Branch Details");
		accountRespBranch.setStatusDO(statusDO);
		accountRespBranch.setRequestType("getBranch");

		return new ResponseEntity<>(accountRespBranch, HttpStatus.OK);

	}

}
