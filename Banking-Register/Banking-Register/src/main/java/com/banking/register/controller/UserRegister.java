package com.banking.register.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.banking.register.entity.Customer;

@Controller
@RequestMapping("/Users")
public interface UserRegister {

	@GetMapping("/welcome")
	public String viewHomePage();
	
	@GetMapping("/loginpage")
	public RedirectView loginPage();

	@GetMapping("/showRegisterForm")
	public String showRegisterForm(Model model);

	@PostMapping("/register")
	public String registerUser(Customer customer);

	
}
