package com.banking.register.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.view.RedirectView;

import com.banking.register.controller.UserRegister;
import com.banking.register.entity.Customer;
import com.banking.register.service.impl.UserRegisterServiceImpl;

@Component
public class UserRegisterController implements UserRegister {

	@Autowired
	UserRegisterServiceImpl userRegisterServiceImpl;

	Customer theCustomer = new Customer();

	@Override
	public String viewHomePage() {
		return "Users/welcome";
	}

	@Override
	public RedirectView loginPage() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("http://localhost:8086");
		return redirectView;

	}

	@Override
	public String showRegisterForm(Model model) {
		model.addAttribute("customer", theCustomer);
		return "Users/register-form";
	}

	@Override
	public String registerUser(@ModelAttribute("customer") Customer theCustomer) {

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(theCustomer.getPassword());
		theCustomer.setPassword(encodedPassword);
		theCustomer.setEnabled(true);
		userRegisterServiceImpl.registerUser(theCustomer);
		return "Users/user-register";
	}

}
