package com.banking.loan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banking.loan.entity.Loan;

public interface LoanRepo extends JpaRepository<Loan, Integer> {

	@Query("SELECT u FROM Loan u WHERE u.loanType =:loanType ")
	public Loan findByLoanType(String loanType);
}
