package com.app.restSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.restSpring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value="select * from User u where u.name =: name and u.password =: password")
	public User findUser(String name,String password);
	
	
}
