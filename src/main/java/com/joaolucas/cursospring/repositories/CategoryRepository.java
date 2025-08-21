package com.joaolucas.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.cursospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
