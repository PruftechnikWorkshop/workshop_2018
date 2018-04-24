package com.pruftechnik.workshop.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruftechnik.workshop.model.Signal;

@Transactional
@Repository
public interface SignalRepository extends JpaRepository<Signal, Long> {	
	
		public List<Signal> findFirst100ByOrderByIdDesc();

}
