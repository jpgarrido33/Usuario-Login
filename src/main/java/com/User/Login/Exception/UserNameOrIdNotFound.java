package com.User.Login.Exception;

public class UserNameOrIdNotFound  extends Exception { 

		private static final long serialVersionUID = 1668398822129870029L;

		public UserNameOrIdNotFound() {
			super("Usuario o Id no encontrado");
		}
		
		public UserNameOrIdNotFound(String message) {
			super(message);
		
	}

}
