package com.banking.loan.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.banking.loan.dao.UserLoanDao;
import com.banking.loan.entity.Customer;
import com.banking.loan.entity.Loan;
import com.banking.loan.entity.UserLoanDetail;
import com.banking.loan.loanResponseHandler.LoanNotAppliedException;
import com.banking.loan.repo.CustomerRepo;
import com.banking.loan.repo.LoanRepo;
import com.banking.loan.repo.UserLoanDetailRepo;
import com.banking.loan.requestMapper.UserLoanRequestMapper;

@Repository
public class UserLoanDaoImpl implements UserLoanDao {

	@Autowired
	LoanRepo loanRepo;
	
	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	UserLoanDetailRepo userLoanDetailRepo;
	
	@Override
	public String applyLoan(UserLoanRequestMapper userLoanRequestMapper, UserLoanDetail userLoanDetail) {
		try {		
		Loan loan = loanRepo.findByLoanType(userLoanRequestMapper.getLoanType());
		Customer customer = customerRepo.findByNameAndPhone(userLoanRequestMapper.getCustomerName(), userLoanRequestMapper.getPhoneNo());
		
		userLoanDetail.setLoanId(loan.getLoanId());
		userLoanDetail.setUserId(customer.getUserId());
		
		userLoanDetailRepo.save(userLoanDetail);
		}catch(Exception e) {
			throw new LoanNotAppliedException("Loan Application Failed");
		}
		return "Success";
	}

}
