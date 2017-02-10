package com.manitos.converter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestCrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
		System.out.println(pe.encode("user"));
		
		/* INSERT INTO users (username, enabled, password)
		 VALUES ("user", 1, "$2a$10$I4nb7gRPK1n1EZqLBMcMcO8G.3j4LFt2x7VMMMozfkFdQjbOpvxMK");
		 INSERT INTO user_role (role, username) VALUES ("ROLE_USER", "user");
		*/
	}
}
