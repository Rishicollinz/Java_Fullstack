package com.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.service.WelcomeService;

@Controller
@RequestMapping(value="/")
public class HelloWorldController {
	
	WelcomeService welcomeService=new WelcomeService();
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView welcome1() {
		return new ModelAndView("welcomepage","welcomeMessage","springm1");
	}
	
	@RequestMapping(value="/new",method=RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("welcomepage","welcomeMessage","spring1");
	}
	
	@RequestMapping(value="/new1",method=RequestMethod.GET)
	public ModelAndView welcomeAgain() {
		return new ModelAndView("welcomepage","welcomeMessage",welcomeService.thirdmsg());
	}
	
	@RequestMapping(value="/connect",method=RequestMethod.GET)
	public ModelAndView welcomeAgain2() throws ClassNotFoundException, SQLException {
		return new ModelAndView("welcomepage","connectchk",welcomeService.connect());
	}
	
	
}