package com.banking.account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banking.account.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
	
	@Query("SELECT u FROM Branch u WHERE u.state =:state AND u.city =:city")
	public Branch findByStateAndCity(String state, String city);

}
