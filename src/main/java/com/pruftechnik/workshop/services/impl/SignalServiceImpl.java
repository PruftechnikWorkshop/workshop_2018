package com.pruftechnik.workshop.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pruftechnik.workshop.model.Signal;
import com.pruftechnik.workshop.repositories.SignalRepository;
import com.pruftechnik.workshop.services.SignalService;

@Repository
public class SignalServiceImpl implements SignalService {
	
	@Autowired
	private SignalRepository signalRepository;
	
	@Override
	public Signal addSignal(Signal signal) {
		return signalRepository.save(signal);		
	}

	@Override
	public List<Signal> addSignals(List<Signal> signals) {
		return signalRepository.saveAll(signals);
		
	}
	
	@Override
	public List<Signal> getSignals(){
		return signalRepository.findAll();
	}
	

}
