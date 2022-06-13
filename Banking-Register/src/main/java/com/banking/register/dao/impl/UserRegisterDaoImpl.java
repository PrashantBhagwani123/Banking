package com.banking.register.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.banking.register.dao.UserRegisterDao;
import com.banking.register.entity.Customer;
import com.banking.register.entity.Role;
import com.banking.register.entity.UserRoles;
import com.banking.register.repo.CustomerRepository;
import com.banking.register.repo.RoleRepository;
import com.banking.register.repo.UserRolesRepo;
import com.banking.register.responseHandler.UserNotRegistered;

@Repository
public class UserRegisterDaoImpl implements UserRegisterDao {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	UserRolesRepo userRolesRepo;

	@Autowired
	RoleRepository roleRepository;

	@Override
	public String registerUser(Customer customer) {
		try {
			Customer theCustomer = customerRepository.save(customer);
			Role role = roleRepository.findByRole("user");
			UserRoles userRoles = new UserRoles();
			userRoles.setRoleId(role.getRoleId());
			userRoles.setUserId(theCustomer.getUserId());
			userRolesRepo.save(userRoles);

		} catch (Exception e) {
			throw new UserNotRegistered("Registration Failed");
		}
		return "Success";
	}

}
