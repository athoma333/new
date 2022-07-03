package com.booking.flightApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.flightApp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
