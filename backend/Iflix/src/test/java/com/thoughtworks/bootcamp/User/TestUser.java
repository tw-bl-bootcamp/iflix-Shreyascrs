package com.thoughtworks.bootcamp.User;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.thoughtworks.bootcamp.dto.LoginDto;
import com.thoughtworks.bootcamp.response.Response;
import com.thoughtworks.bootcamp.service.IflixServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUser {

//	@Test
//	void givenValidUserData_WhenLoginCalled_ThenReturnResponse() {
//		LoginDto loginData = new LoginDto("shrs601@gmail.com", "shrs601");
//		Response response = new Response(200, "login succesfull", "");
//		IflixServiceImpl service = new IflixServiceImpl();
//		Assertions.assertEquals(response.getStatusCode(), service.login(loginData).getStatusCode());
//	}

	@Test
	public void test() {
		assertEquals(4, 2+2);
	}
	

}
