package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/users",method=RequestMethod.GET)
public class MyController {
	@RequestMapping(value="{userName}/{age}",method=RequestMethod.GET)
	public ModelAndView getData(@PathVariable Map<String,String> pathMaps,@RequestParam("gender")String gender) {
		
		String userName=pathMaps.get("userName");
		int age=Integer.parseInt(pathMaps.get("age"));
		
		String data="details "+userName+" "+age+" "+gender;
		return new ModelAndView("welcome","msg",data);
	}
}
