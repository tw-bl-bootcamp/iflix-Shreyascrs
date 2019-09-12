package com.thoughtworks.bootcamp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thoughtworks.bootcamp.User.User;
import com.thoughtworks.bootcamp.dto.LoginDto;
import com.thoughtworks.bootcamp.repository.UserRepository;
import com.thoughtworks.bootcamp.response.Response;
import com.thoughtworks.bootcamp.utility.PasswordEncryption;
import com.thoughtworks.bootcamp.utility.TokenUtility;

@Service
public class IflixServiceImpl implements IService {
	@Autowired
	UserRepository repository;
	@Autowired
	PasswordEncryption encryption;
	@Autowired
	Response response;
	@Autowired
	TokenUtility tokenutil;

	public Response login(LoginDto dtoUser) {
		Optional<User> repoUser = repository.findByemailId(dtoUser.getEmailId());
		if (repoUser.isPresent()) {
			if (encryption.isPassword(dtoUser, repoUser.get())) {
				String token = tokenutil.createToken(repoUser.get().getUserId());
				return response.sendresponse(200, "login syccessfull", token);
			} else {
				return response.sendresponse(204, "password not matching", "");
			}
		} else {
			return response.sendresponse(404, "not user not registered", "");
		}

	}
}
