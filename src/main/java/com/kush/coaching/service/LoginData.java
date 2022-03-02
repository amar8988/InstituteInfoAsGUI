package com.kush.coaching.service;


import org.springframework.context.ConfigurableApplicationContext;

import com.kush.coaching.entity.User;
import com.kush.coaching.repository.UserRepository;

public class LoginData {
	
	
	public User meth(int id, ConfigurableApplicationContext configContext) {
		User user=null;
		
		try {
			user = ((UserRepository) configContext.getBean(UserRepository.class)).findById(id).get();
		}catch(Exception e) {
			e.getMessage();
		}
		
		return user;
	}
}