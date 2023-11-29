package com.louay.users.service;

import org.springframework.stereotype.Service;

import com.louay.users.entities.Role;
import com.louay.users.entities.User;

import jakarta.transaction.Transactional;



public interface UserService {
	
	User saveUser(User user);
	User findUserByUsername(String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);

}
