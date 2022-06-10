package com.banking.account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banking.account.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {

	@Query("SELECT u FROM Account u WHERE u.accountType =:accountType")
	public Account findByAccountType(String accountType);
}
