package com.pruftechnik.workshop.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruftechnik.workshop.model.Signal;

@Transactional
public interface SignalRepository extends JpaRepository<Signal, Long> {

}
