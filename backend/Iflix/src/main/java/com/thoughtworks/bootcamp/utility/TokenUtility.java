package com.thoughtworks.bootcamp.utility;

import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.Verification;

@Component
public class TokenUtility {

	private final  String secretKey = "23456789@#$%";

	public  String createToken(int userId) {
		Algorithm algorithm=null;
		try {
		algorithm = Algorithm.HMAC256(secretKey);
		} catch (IllegalArgumentException e) {
		e.printStackTrace();
	}
	String token = JWT.create().withClaim("ID", userId).sign(algorithm);
	return token;
	}
	public  int verifyToken(String token) {
	Verification verification = null;
	try {
	verification = JWT.require(Algorithm.HMAC256(secretKey));
	} catch (IllegalArgumentException e) {
	e.printStackTrace();
	}
	JWTVerifier jwtverifier = verification.build();
	DecodedJWT decodedjwt = jwtverifier.verify(token);
	Claim claim = decodedjwt.getClaim("ID");
	int userid = claim.asInt();
	System.out.println(userid);
	return userid;
	}

}
