package com.pruftechnik.workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruftechnik.workshop.model.Signal;
import com.pruftechnik.workshop.services.SignalService;

@RestController
@EnableDiscoveryClient
@RequestMapping("/api")
public class SignalController {

	@Autowired
	private SignalService signalService;
	
	@GetMapping("/allsignals")
	public List<Signal> getAllSignals(){
		return signalService.getSignals();
	}
	
	@GetMapping("/signals")
	public List<Signal> getSignals(){
		return signalService.getFirstOneHundredSignals();
	}
	
	@PostMapping("/signal")
	public Signal addSignal(@RequestBody Signal signal) {
		Signal s = signalService.addSignal(signal);
		
		return s;
	}
	
	@PostMapping("/signals")
	public List<Signal> addSignals(@RequestBody List<Signal> signal) {
		List<Signal> s = signalService.addSignals(signal);
		
		return s;
	}
	
	@GetMapping("/")
	public String index() {
		return "Greeting .....";
	}
}
