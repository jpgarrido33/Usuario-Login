package com.User.Login.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.User.Login.Model.Role;
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

	public Role findByName(String role);
}
