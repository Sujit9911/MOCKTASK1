package com.app.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.dao.LoginDAO;
import com.app.demo.model.User;

@Service
public class LoginService{
	@Autowired
LoginDAO loginDAO;
	
	

	public void addUserDetails(User user) {
		loginDAO.save(user);
		System.out.println("User details added successfully: " + user);
	}
	
}