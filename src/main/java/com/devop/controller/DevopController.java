package com.devop.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DevopController {

	@GetMapping(path="/set1")
	public String getValue() {
		return "HelloWorld";
	}
	

}
