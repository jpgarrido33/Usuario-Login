package com.User.Login.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.Login.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public Optional<?> findByUserName(String username);
	
	public Optional<?> findByIdAndPassword(Long id, String password);
}
