package com.banking.account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banking.account.entity.CustomerDetail;

public interface CustomerDetailRepo extends JpaRepository<CustomerDetail, Integer> {

	@Query("SELECT u FROM CustomerDetail u WHERE u.customerName =:customerName AND u.phoneNo =:phoneNo")
	public CustomerDetail findByNameAndPhone(String customerName, String phoneNo);
}
