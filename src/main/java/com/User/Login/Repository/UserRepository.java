package com.User.Login.Repository;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.User.Login.Model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public Optional<User> findByUsername(String username);
}
