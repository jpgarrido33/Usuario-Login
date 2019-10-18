package com.User.Login.DTO;

import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {

	
private Long id;
	
	@NotBlank(message = "Debe especificar un nombre")
	private String firstName;
	private String lasName;
	@NotBlank(message = "Debe especificar un email válido")
	private String email;
	@NotBlank(message = "Debe especificar un nombre de usuario")
	private String userName;
	@NotBlank(message = "Debe especificar una contraseña")
	private String password;
	@NotBlank(message = "Confirme su contraseña")
	private String confirmPasword;
	
	
	
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
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", firstName=" + firstName + ", lasName=" + lasName + ", email=" + email
				+ ", userName=" + userName + ", password=" + password + ", confirmPasword=" + confirmPasword + "]";
	}
	public UserDTO(Long id, @NotBlank(message = "Debe especificar un nombre") String firstName, String lasName,
			@NotBlank(message = "Debe especificar un email válido") String email,
			@NotBlank(message = "Debe especificar un nombre de usuario") String userName,
			@NotBlank(message = "Debe especificar una contraseña") String password,
			@NotBlank(message = "Confirme su contraseña") String confirmPasword) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lasName = lasName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.confirmPasword = confirmPasword;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
