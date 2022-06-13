package com.banking.register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.register.dao.impl.UserRegisterDaoImpl;
import com.banking.register.entity.Customer;
import com.banking.register.service.UserRegisterService;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {

	@Autowired
	UserRegisterDaoImpl userRegisterDaoImpl;

	@Override
	public String registerUser(Customer customer) {
		return userRegisterDaoImpl.registerUser(customer);
	}

}
