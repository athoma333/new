package com.booking.flightApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.flightApp.Dao.UserDao;
import com.booking.flightApp.entity.User;
import com.booking.flightApp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserDao userDao;
	
	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void removeUser(Integer userNumber) {
		userRepository.deleteById(userNumber);
	}

	@Override
	public User modifyUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public Iterable<User> viewAllUserss() {
		return userDao.findAll();
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Integer id) {
		return userRepository.findById(id).get();
	}

}
