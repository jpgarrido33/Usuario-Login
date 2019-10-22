package com.User.Login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.Login.Model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
