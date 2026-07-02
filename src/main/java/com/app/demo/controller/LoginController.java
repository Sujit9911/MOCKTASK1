package com.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.demo.model.User;
import com.app.demo.service.LoginService;

@Controller
@RequestMapping("/users")
public class LoginController {

	@Autowired
	LoginService loginService;

	@GetMapping("/login")
	public String loginPage() {
		return "Login";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute User user, Model model) {
		loginService.addUserDetails(user);

		return "dashboard";
	}

}	