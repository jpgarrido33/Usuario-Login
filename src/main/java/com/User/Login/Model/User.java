package com.User.Login.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;



@Entity
public class User {

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
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Role role;

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



	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lasName=" + lasName + ", email=" + email
				+ ", userName=" + userName + ", password=" + password + ", confirmPasword=" + confirmPasword + ", role="
				+ role + "]";
	}



	public User(Long id, String firstName, String lasName, String email, String userName, String password,
			String confirmPasword, Role role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lasName = lasName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.confirmPasword = confirmPasword;
		this.role = role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub implementar nueva..
	}
	
	
}
