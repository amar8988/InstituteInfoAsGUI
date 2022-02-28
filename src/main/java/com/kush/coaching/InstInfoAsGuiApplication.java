package com.kush.coaching;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.kush.coaching.gui.LoginFrame;
import com.kush.coaching.repository.UserRepository;

@SpringBootApplication
public class InstInfoAsGuiApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = new												//not required for web applications
				 SpringApplicationBuilder(InstInfoAsGuiApplication.class) .headless(false)
				 .run(args);
		
		LoginFrame.login((UserRepository) context.getBean(UserRepository.class));
	}
}
