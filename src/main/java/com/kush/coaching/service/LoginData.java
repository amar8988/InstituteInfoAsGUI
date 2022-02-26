package com.kush.coaching.service;


import com.kush.coaching.entity.User;
import com.kush.coaching.repository.UserRepository;

public class LoginData {
	
	public User meth(int id, UserRepository userRepository) {
		User user=null;
		
		try {
			user = userRepository.findById(id).get();
		}catch(Exception e) {
			e.getMessage();
		}
		
		return user;
	}
}