package com.User.Login.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.Login.Repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Iterable getAllUser() {
		
		return userRepository.findAll();
	}

}
