package com.banking.account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banking.account.entity.UserAccountDetail;

public interface AccountDetailRepo extends JpaRepository<UserAccountDetail, Integer> {
	@Query("SELECT u FROM UserAccountDetail u WHERE u.accountNumber =:accountNumber OR u.customerId =:customerId")
	public UserAccountDetail findByAccountAndCustomer(String accountNumber, String customerId);

	
}
