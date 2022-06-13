package com.banking.loan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banking.loan.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	@Query("SELECT u FROM Customer u WHERE u.customerName =:customerName AND u.phoneNo =:phoneNo")
	public Customer findByNameAndPhone(String customerName, String phoneNo);
}
