package com.price.price.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PricingController {

	@GetMapping("/getPrice")
	float getPrice() {
		return 1000;
	}
}
