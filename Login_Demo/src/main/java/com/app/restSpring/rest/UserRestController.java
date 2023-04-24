package com.app.restSpring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.restSpring.model.User;
import com.app.restSpring.service.UserService;



@RestController
public class UserRestController {

	@Autowired
	private UserService userservice;


	@RequestMapping("/login")
	public String login(@RequestParam("name") String uname,@RequestParam("password") String password,Model model)
	{
		User u= userservice.findUser(uname, password);
		model.addAttribute("user", u);
		return "register1";
	}
	
	@RequestMapping("/user_data")
	public String addEmployee(@RequestBody User theUser)
	{
		theUser.setId(0);
		userservice.save(theUser);
		return "login_success";
	}
}
