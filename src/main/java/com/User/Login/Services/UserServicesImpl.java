package com.User.Login.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.Login.Model.User;
import com.User.Login.Repository.UserRepository;


@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Iterable getAllUser() {
		
		return userRepository.findAll();
	}
	
	private boolean checkUsernameAvailable(User user) throws Exception {
		Optional userFound = userRepository.findByUserName(user.getUserName());
		if (userFound.isPresent()) {
			throw new Exception("Username no disponible");
		}
		return true;
	}

	private boolean checkPasswordValid(User user) throws Exception {
		if ( !user.getPassword().equals(user.getConfirmPasword())) {
			throw new Exception("Password y Confirm Password no son iguales");
		}
		return true;
	}


	@Override
	public User createUser(User user) throws Exception {
		if (checkUsernameAvailable(user) && checkPasswordValid(user)) {
			user = userRepository.save(user);
		}
		return user;
	}

	@Override
	public User getUserById(Long id) throws Exception {
		
		return  userRepository.findById(id).orElseThrow(() -> new Exception("El usuario no existe"));
	}

	@Override
	public User updateUser(User fromUser) throws Exception {
		User toUser = getUserById(fromUser.getId());
		mapUser(fromUser, toUser);
		return userRepository.save(toUser);
	}
	
	/**
	 * Map everythin but the password.
	 * @param from
	 * @param to
	 */
	protected void mapUser(User from,User to) {
		to.setUserName(from.getUserName());
		to.setFirstName(from.getFirstName());
		to.setLasName(from.getLasName());
		to.setEmail(from.getEmail());
		to.setRole(from.getRole());
	}

}
