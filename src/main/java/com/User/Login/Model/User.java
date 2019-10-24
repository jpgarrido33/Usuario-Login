package com.User.Login.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;





@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7522930770111942322L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
	private Long id;
	
	private String firstName;
	private String lasName;
	private String email;
	private String userName;
	private String password;
	
	@Transient
	private String confirmPasword;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Role> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasName() {
		return lasName;
	}

	public void setLasName(String lasName) {
		this.lasName = lasName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPasword() {
		return confirmPasword;
	}

	public void setConfirmPasword(String confirmPasword) {
		this.confirmPasword = confirmPasword;
	}



	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lasName=" + lasName + ", email=" + email
				+ ", userName=" + userName + ", password=" + password + ", confirmPasword=" + confirmPasword
				+ ", roles=" + roles + "]";
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub implementar 
	}
	
	
}
