package com.banking.account.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.banking.account.dao.UserAccountDao;
import com.banking.account.entity.Account;
import com.banking.account.entity.Branch;
import com.banking.account.entity.CustomerDetail;
import com.banking.account.entity.UserAccountDetail;
import com.banking.account.repo.AccountDetailRepo;
import com.banking.account.repo.AccountRepo;
import com.banking.account.repo.BranchRepository;
import com.banking.account.repo.CustomerDetailRepo;
import com.banking.account.requestMapper.UserAccountDetailMapper;
import com.banking.account.responseHandler.AccountNotCreatedException;
import com.banking.account.responseHandler.BranchDetailsNotFound;

@Repository
public class UserAccountDaoImpl implements UserAccountDao {

	@Autowired
	BranchRepository branchRepository;

	@Autowired
	AccountDetailRepo accountDetailRepo;

	@Autowired
	CustomerDetailRepo customerDetailRepo;

	@Autowired
	AccountRepo accountRepo;

	@Override
	public Branch getBranch(String state, String city) {
		Branch branch = branchRepository.findByStateAndCity(state, city);
		if (branch == null) {
			throw new BranchDetailsNotFound("Branch Details Not Found");
		}
		return branch;
	}

	@Override
	public String addAccount(UserAccountDetailMapper userAccountDetailMapper, UserAccountDetail userAccountDetail) {
		try {
			CustomerDetail customerDetail = customerDetailRepo.findByNameAndPhone(
					userAccountDetailMapper.getCustomerName(), userAccountDetailMapper.getPhoneNo());
			userAccountDetail.setUserId(customerDetail.getUserId());

			Account account = accountRepo.findByAccountType(userAccountDetailMapper.getAccountType());
			userAccountDetail.setAccountId(account.getAccountId());

			accountDetailRepo.save(userAccountDetail);
		} catch (Exception e) {
			throw new AccountNotCreatedException("Account not created");
		}

		return "Success";
	}

	public boolean accountAndCustomerCheck(String accountNumber, String customerId) {
		UserAccountDetail userAccountCustomer = new UserAccountDetail();

		userAccountCustomer = accountDetailRepo.findByAccountAndCustomer(accountNumber, customerId);
		if (userAccountCustomer == null) {
			return true;
		}

		return false;

	}

}
