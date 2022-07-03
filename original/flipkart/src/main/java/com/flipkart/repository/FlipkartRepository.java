package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.model.FlipkartEntity;

public interface FlipkartRepository extends JpaRepository<FlipkartEntity, Integer>{

}
