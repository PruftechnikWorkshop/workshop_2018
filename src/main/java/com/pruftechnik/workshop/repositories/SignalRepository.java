package com.pruftechnik.workshop.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruftechnik.workshop.model.Signal;

@Transactional
public interface SignalRepository extends JpaRepository<Signal, Long> {	
	
		public List<Signal> findFirst100ByOrderByIdDesc();

}
