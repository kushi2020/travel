package com.covid.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.covid.travel.domain.User;
import com.covid.travel.service.UserService;

@ResponseBody
@RequestMapping("/travelDate")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	private UserService userService;
	
	
//	@PostMapping
//	public Iterable<User>travelBetween(@RequestParam ("travelDateToFrom") String travelDateToFrom)
//	{
//		
//		userService.traveBetween(travelDateToFrom);
//		return 
//	}


	@PostMapping("/list")
	public Iterable<User>list()
	{
		return userService.list();
	}
}
