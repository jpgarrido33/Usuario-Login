package com.User.Login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.User.Login.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
