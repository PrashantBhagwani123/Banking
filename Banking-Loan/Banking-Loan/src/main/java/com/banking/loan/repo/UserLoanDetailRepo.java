package com.banking.loan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.loan.entity.UserLoanDetail;

public interface UserLoanDetailRepo extends JpaRepository<UserLoanDetail, Integer> {

}
