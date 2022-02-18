package com.kush.coaching.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.kush.coaching.repository.UserRepository;

public class LoginData {
	@Autowired
	private UserRepository userRepository;
	
	public String meth(int id) {
		String pwd="";
		
		try {
			pwd = userRepository.findById(id).get().getPassword();
		}catch(Exception e) {
			e.getMessage();
		}
		
		return pwd;
	}
}