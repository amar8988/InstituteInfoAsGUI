package com.kush.coaching;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kush.coaching.entity.User;
import com.kush.coaching.repository.UserRepository;

@RestController
public class DemoController {
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/demo")
	public void demo() {
		List<User> users = (List<User>) userRepository.findAll();
		
		for(User user : users)
			System.out.println(user);
	}
}
