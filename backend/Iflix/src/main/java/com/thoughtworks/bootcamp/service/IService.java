package com.thoughtworks.bootcamp.service;

import com.thoughtworks.bootcamp.dto.LoginDto;
import com.thoughtworks.bootcamp.response.Response;

public interface IService {
public Response login(LoginDto dtoUser);
}
