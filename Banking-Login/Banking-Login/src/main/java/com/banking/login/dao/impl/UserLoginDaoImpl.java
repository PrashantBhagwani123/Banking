package com.banking.login.dao.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.banking.login.dao.UserLoginDao;
import com.banking.login.entity.User;

@Repository
public class UserLoginDaoImpl implements UserLoginDao {

	@Autowired
	UserRepository userRepository;

	@Override
	public User getCustomerDetail(String userName) {
		return userRepository.findByUserName(userName);
	}

	public List<User> listUsers() {
		return userRepository.findAll();
		
	}

	

}
