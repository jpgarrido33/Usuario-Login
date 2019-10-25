package com.User.Login.Services;

import javax.validation.Valid;

import com.User.Login.DTO.ChangePasswordForm;
import com.User.Login.Model.User;
import com.User.Login.Exception.UserNameOrIdNotFound;

public interface UserServices {
	
	public Iterable <User> getAllUser();


public User createUser( User user) throws Exception;
public User getUserById(Long id) throws Exception;
public User updateUser(User user) throws Exception;
public void deleteUser(Long id) throws Exception;
public User changePassword(ChangePasswordForm form) throws Exception;

}
