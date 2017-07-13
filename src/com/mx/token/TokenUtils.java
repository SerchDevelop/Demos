package com.mx.token;

import java.util.Date;
import java.util.UUID;

import org.springframework.util.DigestUtils;

public class TokenUtils {

	public static void main(String[] args) {

		//1. generate UUID
		//2. append username, password and token date
		//3. generate MD5 as token
		//4. append at begin token KEY= IGSRS string value, what mean that this token is from ingenset Rest api
		StringBuffer tokenBuffer=new StringBuffer(UUID.randomUUID().toString());
		tokenBuffer.append("ghigueras").append("INDRA").append(new Date());
		String tokenCreate = DigestUtils.md5DigestAsHex(tokenBuffer.toString().getBytes());
		System.out.println("tokenCreate :: IGSRS#" + tokenCreate);

	}

}
