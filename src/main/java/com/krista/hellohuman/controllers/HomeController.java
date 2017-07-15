package com.krista.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

@Controller


public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false, defaultValue="Human") String SearchQuery, HttpSession session){

		String user = SearchQuery;
		session.setAttribute("user", user);
		
		return "index";
	}

}
