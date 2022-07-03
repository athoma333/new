package com.booking.flightApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.flightApp.entity.User;
import com.booking.flightApp.service.UserServiceImpl;

@RestController
@RequestMapping("/api/v1.0/flight")
public class UserController {
	@Autowired
	UserServiceImpl userService;
	
	@PostMapping("/adduser")
	public User createFlight(@RequestBody User userEntity) {
		return userService.addUser(userEntity);
	}

	@DeleteMapping("/deleteuser/{id}")
	public String removeFlight(@PathVariable("id") Integer userNumber) {
		userService.removeUser(userNumber);
		return "Flight with flight number: "+userNumber+" removed";
	}
	
	@PutMapping("/updateuser")
	public User updateFlight(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@GetMapping("/viewallusers")
	public Iterable<User> viewAllUsers(){
		return userService.viewAllUserss();
	}
	
	@GetMapping("/getuser/{id}")
	public User findFlightById(@PathVariable("id") Integer userNumber) {
		return userService.getUserById(userNumber);
	}
}
