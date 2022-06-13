package com.banking.register.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.register.entity.UserRoles;

public interface UserRolesRepo extends JpaRepository<UserRoles, Integer> {

}
