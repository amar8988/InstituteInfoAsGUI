package com.kush.coaching.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kush.coaching.repository.UserRepository;

@Service
public class LoginData {
	@Autowired
	private UserRepository userRepository;
	
	public String meth(String userName) {
		
		return userRepository.findByUserName(userName).get().getPassword();
	}
}
