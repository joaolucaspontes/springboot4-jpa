package com.joaolucas.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.cursospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
