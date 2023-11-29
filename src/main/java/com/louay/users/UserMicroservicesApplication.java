package com.louay.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.louay.users.entities.Role;
import com.louay.users.entities.User;
import com.louay.users.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UserMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMicroservicesApplication.class, args);
	}
	
	@Autowired
	UserService userService;
	/*
	@PostConstruct
	void init_users() {
		userService.addRole(new Role(null,"ADMIN"));
		userService.addRole(new Role(null,"USER"));
		
		userService.saveUser(new User(null,"admin","123",true,null));
		userService.saveUser(new User(null,"louay","123",true,null));
		userService.saveUser(new User(null,"example","123",true,null));
		
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		
		userService.addRoleToUser("louay", "USER");
		userService.addRoleToUser("example", "USER");

	}
	*/
	
	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}
	
	
	

}
