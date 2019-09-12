package com.thoughtworks.bootcamp.User;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import com.thoughtworks.bootcamp.dto.LoginDto;
import com.thoughtworks.bootcamp.repository.UserRepository;
import com.thoughtworks.bootcamp.response.Response;
import com.thoughtworks.bootcamp.service.IService;
import com.thoughtworks.bootcamp.utility.PasswordEncryption;

class TestService {
	
	@Mock
	UserRepository repository;
	@InjectMocks
	IService service;
	@Autowired
	PasswordEncryption encrypt;

	@Test
	void givenLoginDeatils_WhenLoginCalled_ThenReturnResponce() {
		Response responce=new Response(200,"","");
		User user=new User(1,"abcd123@gmail.com",encrypt.encryption("abcd"),"raj");
		LoginDto logindata=new LoginDto("abcd123@gmail.com", "abcd");
		when(repository.findByemailId("abcd123@gmail.com")).thenReturn(Optional.of(user));
		assertEquals(responce.getStatusCode(), service.login(logindata).getStatusCode());
		
	}

}
