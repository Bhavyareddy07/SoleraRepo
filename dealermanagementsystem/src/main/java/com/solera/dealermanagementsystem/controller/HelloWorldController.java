package com.solera.dealermanagementsystem.controller;

import com.solera.dealermanagementsystem.service.HelloWorldService;

public class HelloWorldController {
	@Autowired
	private HelloWorldService helloWorldService;
	
	
	@GetMapping("/greeting")
	public String greetings() {
		return "Hello Everyone enjoy spring boot. Thank god its friday";
	}
	@GetMapping("/message/{id}")
	public String getMessage(@PathVariable Integer id) {
		return helloWorldService.getMessage(id);
	}
	@PostMapping("/addMessage")
	public String addMessage(@RequestBody Message message) {
		helloWorldService.addMessage(message);
		return "Added successfully";
	}
}
