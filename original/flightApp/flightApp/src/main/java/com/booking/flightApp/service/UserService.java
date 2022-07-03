package com.booking.flightApp.service;

import com.booking.flightApp.entity.User;

public interface UserService{

	public User addUser(User user);
	public void removeUser(Integer userNumber);
	public User modifyUser(User user);
	public Iterable<User> viewAllUserss();
	public User updateUser(User user);
	public User getUserById(Integer id);
}
