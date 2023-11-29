package com.louay.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.louay.users.entities.Role;

public interface RoleRepository  extends JpaRepository<Role, Long>{

	Role findByRole(String role);
	
}
