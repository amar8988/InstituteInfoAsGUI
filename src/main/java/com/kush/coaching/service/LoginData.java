package com.kush.coaching.service;


import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;

import com.kush.coaching.entity.StudentDetail;
import com.kush.coaching.entity.User;
import com.kush.coaching.repository.StudentRepository;
import com.kush.coaching.repository.UserRepository;

public class LoginData {
	
	
	public static User meth(int id, ConfigurableApplicationContext configContext) {
		User user=null;
		
		try {
			user = ((UserRepository) configContext.getBean(UserRepository.class)).findById(id).get();
		}catch(Exception e) {
			e.getMessage();
		}
		
		return user;
	}
	
	public static List<StudentDetail> getStudents(ConfigurableApplicationContext configContext) {
		List<StudentDetail> students = (List<StudentDetail>) (configContext.getBean(StudentRepository.class)).findAll();
		
		return students;
	}
}