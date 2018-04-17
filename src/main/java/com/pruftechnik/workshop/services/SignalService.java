package com.pruftechnik.workshop.services;

import java.util.List;

import com.pruftechnik.workshop.model.Signal;

public interface SignalService {
	
	public Signal addSignal(Signal s);
	
	public List<Signal> addSignals(List<Signal> signals);
	
	public List<Signal> getSignals();
}
