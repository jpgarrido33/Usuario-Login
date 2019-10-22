package com.User.Login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.User.Login.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
