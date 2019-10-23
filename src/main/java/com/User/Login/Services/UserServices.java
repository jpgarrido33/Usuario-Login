package com.User.Login.Services;

import javax.validation.Valid;

import com.User.Login.Model.User;

public interface UserServices {
	
	public Iterable getAllUser();


public User createUser(@Valid User user) throws Exception;
public User getUserById(Long id) throws Exception;
public User updateUser(User user) throws Exception;

}
