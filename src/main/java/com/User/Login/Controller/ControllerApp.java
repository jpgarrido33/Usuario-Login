package com.User.Login.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class ControllerApp {

	@Controller
	public class UserController {

		@GetMapping("/")
		public String index() {
			return "index";
		}
		
		@GetMapping("/userForm")
		public String getUserForm() {
			return "user-form";
		}	
	}
}
