package com.thoughtworks.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.bootcamp.dto.LoginDto;
import com.thoughtworks.bootcamp.response.Response;
import com.thoughtworks.bootcamp.service.IService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	IService service;

	@PostMapping("login")
	public Response login(@RequestBody LoginDto user) {
		return service.login(user);
	}
}
