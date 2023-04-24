package com.app.restSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.restSpring.model.User;

@Controller
public class MVCController {

	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/login_form")
	public String showLoginForm(Model model)
	{
		User u = new User();
		model.addAttribute("user",u);
		return "login-form";
	}
	
	@RequestMapping("/register")
	public String showForm(Model model)
	{
		User u = new User();
		model.addAttribute("user",u);
		return "register-form";
	}
	
	
	@RequestMapping("/register1")
	public String submitForm(@ModelAttribute("user") User user)
	{
		System.out.println(user);
		return "register_success";
	}
	
	
}
