package com.banking.login.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.login.dao.impl.UserLoginDaoImpl;
import com.banking.login.entity.User;
import com.banking.login.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	UserLoginDaoImpl userLoginDaoImpl;

	@Override
	public User getCustomerDetail(String userName) {
		
		return userLoginDaoImpl.getCustomerDetail(userName) ;
	}

	public List<User> listUsers() {
		return userLoginDaoImpl.listUsers();
	}
	
	
	

}
