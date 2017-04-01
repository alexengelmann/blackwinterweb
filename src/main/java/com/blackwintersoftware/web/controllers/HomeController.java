package com.blackwintersoftware.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/")
@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(ModelMap model){
		return "index";
	}
}
