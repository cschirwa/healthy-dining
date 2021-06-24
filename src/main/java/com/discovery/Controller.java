package com.discovery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping()
	public String defaultEp() {
		return "This is a fake Healthy Dining Service";
	}

	@GetMapping("/HealthyDining/")
	public String healthyDining() {
		return "This is a fake endpoint for HD";
	}
	
	@GetMapping("/HealthyDining/{serviceName}")
	public String serviceEp(@PathVariable String serviceName) {
		return "This is a fake service endpoint: " + serviceName;
	}
	
}
