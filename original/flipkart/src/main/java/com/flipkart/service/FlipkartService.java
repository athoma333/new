package com.flipkart.service;

import org.springframework.stereotype.Service;

import com.flipkart.model.FlipkartEntity;

@Service
public interface FlipkartService {

	public FlipkartEntity addFlipkartEntity(FlipkartEntity flipkartEntity);

	public FlipkartEntity addBookToFkEntity(FlipkartEntity flipkartEntity);
}
