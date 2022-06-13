package com.banking.register.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banking.register.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	@Query("SELECT u FROM Role u WHERE u.role =:role")
	public Role findByRole(String role);

}
