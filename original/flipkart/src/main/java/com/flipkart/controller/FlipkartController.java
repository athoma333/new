package com.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.model.FlipkartEntity;
import com.flipkart.service.FlipkartServiceImpl;

@RestController
public class FlipkartController {

	@Autowired
	FlipkartServiceImpl flipkartService;

	@PostMapping("/addflipentity")
	public FlipkartEntity createbook(@RequestBody FlipkartEntity flipkartEntity) {
		return flipkartService.addFlipkartEntity(flipkartEntity);
	}

	@PutMapping("/updateflenwithbook")
	public FlipkartEntity addBookToEntityWithId(@RequestBody FlipkartEntity flipkartEntity) {
		return flipkartService.addBookToFkEntity(flipkartEntity);
	}

}
