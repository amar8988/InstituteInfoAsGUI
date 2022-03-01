package com.kush.coaching;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.kush.coaching.gui.LoginFrame;
import com.kush.coaching.repository.UserRepository;

@SpringBootApplication
public class InstInfoAsGuiApplication {

	public static void main(String[] args) {
		
		/* SpringApplication.run(InstInfoAsGuiApplication.class, args); */
		
		
		  ConfigurableApplicationContext context = new SpringApplicationBuilder(InstInfoAsGuiApplication.class)
				  									.headless(false).run(args);			//not required for web applications
		 
		
		LoginFrame.login((UserRepository) context.getBean(UserRepository.class));
	}
}