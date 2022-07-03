package com.booking.flightApp.Dao;

import org.springframework.data.repository.CrudRepository;

import com.booking.flightApp.entity.User;

public interface UserDao extends CrudRepository<User, Integer>{

}
