package com.covid.travel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.covid.travel.domain.User;
@Service
public interface UserService {


	Iterable<User> traveBetween(String date);
	 User save(User user);

	Iterable<User> save(List<User> users);
	public Iterable<User> list();

}
