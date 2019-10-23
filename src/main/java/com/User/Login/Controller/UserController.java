package com.User.Login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.User.Login.Model.User;
import com.User.Login.Repository.RoleRepository;
import com.User.Login.Services.UserServices;

@Controller
public class UserController {

	@Autowired
	RoleRepository roleRepository;
	
	@Autowired 
	UserServices userService;
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("roles",roleRepository.findAll());
		model.addAttribute("userList", userService.getAllUser());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}
	
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
}
