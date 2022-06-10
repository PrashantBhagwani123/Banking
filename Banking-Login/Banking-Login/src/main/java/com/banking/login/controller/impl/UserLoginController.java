package com.banking.login.controller.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.banking.login.controller.UserLogin;
import com.banking.login.entity.User;
import com.banking.login.service.impl.UserLoginServiceImpl;

@Component
public class UserLoginController implements UserLogin {

	@Autowired
	UserLoginServiceImpl userLoginServiceImpl;

	User user = new User();

	@Override
	public String defaultLogin() {

		Collection<? extends GrantedAuthority> authorities;
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		authorities = auth.getAuthorities();

		String myRole = authorities.toArray()[0].toString();
		String admin = "admin";

		if (myRole.equals(admin)) {
			return "redirect:/admin/";
		}
		return "redirect:/userlogin/";
	}

	@Override
	public String userLogin(Model model) {
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User currentUser = userLoginServiceImpl.getCustomerDetail(userDetails.getUsername());
		model.addAttribute("currentUser", currentUser);
		return "user-welcome";
	}

	@Override
	public String admin(Model model) {
		List<User> listUsers = userLoginServiceImpl.listUsers();
		model.addAttribute("listUsers", listUsers);
		return "adminLogin";
	}

}
