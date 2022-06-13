package com.banking.register.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.register.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
