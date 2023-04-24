package com.app.restSpring.service;


import com.app.restSpring.model.User;

public interface UserService {

//	public Iterable<User> findAll();
	public void save(User theUSer);
	public User findUser(String name,String password);
	
}
