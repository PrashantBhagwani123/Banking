package com.banking.login.service;

import java.util.List;

import com.banking.login.entity.User;

public interface UserLoginService {

	public User getCustomerDetail(String userName);

	public List<User> listUsers();

}
