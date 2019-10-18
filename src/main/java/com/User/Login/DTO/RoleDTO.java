package com.User.Login.DTO;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

@Component
public class RoleDTO {
private Long id;
	
	@NotBlank(message="El campo nombre no puede estar vacio")
	private String name;
	@NotBlank(message="El campo descripción no puede estar vacio")
	private String description;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "RoleDTO [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	public RoleDTO(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public RoleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
