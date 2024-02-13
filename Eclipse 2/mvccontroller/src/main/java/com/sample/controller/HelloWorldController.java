package com.sample.controller;

import javax.servlet.annotation.WebServlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView disp() {
		return new ModelAndView("welcome","msg","welcome to MVC!!");
	}
}