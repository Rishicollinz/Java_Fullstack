package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.model.User;
@Controller
public class UserController {
	@RequestMapping(value = "/",method = RequestMethod.GET)
	 public String register()
	 {
		 return "register";
	 }
	@RequestMapping(value = "/registerSuccess",method = RequestMethod.POST)
	public ModelAndView registerSuccess(@RequestParam("name") String name,@RequestParam("age") int age,@RequestParam("email") String email,@RequestParam("country") String country)
	{
		User user = new User(name,age,email,country);
		ModelAndView modelAndView = new ModelAndView("registerSuccess");
		modelAndView.addObject("userObj",user);		
		 return modelAndView;
	}
}
