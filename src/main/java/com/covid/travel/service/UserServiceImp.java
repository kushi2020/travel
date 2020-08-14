package com.covid.travel.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.travel.domain.DateUtil;
import com.covid.travel.domain.User;
import com.covid.travel.repository.UserRepository;

@Service
@Transactional
public class UserServiceImp implements UserService {
    @Autowired
	private UserRepository userRepository;
	
	

@Override
public Iterable<User> save(List<User> users) {
	
	return userRepository.saveAll(users);
}



	@Override
	public User save(User user) {

		return userRepository.save(user);
	}



	@Override
	public Iterable<User> list() {
		
		return userRepository.findAll();
	}



	@Override
	public Iterable<User> traveBetween(String date) {
		String [] strDate=date.split("+");
	LocalDateTime date1=	DateUtil.parseDateFormat( strDate[0]);
	LocalDateTime date2=	DateUtil.parseDateFormat( strDate[1]);
	
		return null;
	}


	
	
}
