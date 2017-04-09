package com.mif.cms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	@ResponseBody
	public String adItemIndex(){
		return "test";
	}
}
