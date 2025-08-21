package com.joaolucas.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.cursospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
