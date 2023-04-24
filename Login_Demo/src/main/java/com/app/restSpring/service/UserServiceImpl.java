package com.app.restSpring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.restSpring.dao.UserRepository;
import com.app.restSpring.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepository;

	@Override
	public User findUser(String name, String password) {
		User u = userrepository.findUser(name, password);
		return u;
	}

	@Override
	public void save(User theUSer) {
		userrepository.save(theUSer);		
	}
	


}
