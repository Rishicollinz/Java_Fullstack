package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
@Controller
public class UserControl {
	@RequestMapping(value={"/listUser","/li"})
	public ModelAndView listUser() {
		return new ModelAndView("listUser","listUserMsg","i return the users");
	}
	
	@RequestMapping(value="/saveUser")
	public ModelAndView saveUser(User user) {
		return new ModelAndView("saveUser","saveUserMsg","i return saved");
	}
	

	@RequestMapping(value="/delUser")
	public ModelAndView delUser(User user) {
		return new ModelAndView("delUser","delUserMsg","i return deleted");
	}
}
