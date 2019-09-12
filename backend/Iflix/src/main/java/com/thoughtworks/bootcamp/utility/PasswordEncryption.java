package com.thoughtworks.bootcamp.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.thoughtworks.bootcamp.User.User;
import com.thoughtworks.bootcamp.dto.LoginDto;

@Component
public class PasswordEncryption {

	@Autowired
	PasswordEncoder encoder;

	public String encryption(String password) {
		System.out.println(encoder.encode(password));
		return encoder.encode(password);
	}

	public boolean isPassword(LoginDto login, User user) {
		return encoder.matches(login.getPassword(),user.getPassword());
	}
}
