package com.banking.login.dao;

import java.util.List;

import com.banking.login.entity.User;

public interface UserLoginDao {

	public User getCustomerDetail(String userName);

	public List<User> listUsers();
}
