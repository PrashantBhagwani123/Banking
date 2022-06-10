package com.banking.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public interface UserLogin {

	@GetMapping("/userlogin")
	public String userLogin(Model model);

	@GetMapping("/admin")
	public String admin(Model model);

	@GetMapping("/default")
	public String defaultLogin();

}
