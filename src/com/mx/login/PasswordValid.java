package com.mx.login;

public class PasswordValid {

	public static void main(String[] args) {
		
		ThisPasswordEncoder passencoder = new ThisPasswordEncoder();
		Boolean isValid = passencoder.isPasswordValid("XIL2D05KS", "FENIXPRO", null);
		System.out.println("isValid :: " + isValid);
		
		String passEncode = passencoder.encodePassword("FENIXPRO", null);
		System.out.println("FENIXPRO :: " + passEncode);
		
		passEncode = passencoder.encodePassword("FENIXDEV", null);
		System.out.println("FENIXDEV :: " + passEncode);
		
		passEncode = passencoder.encodePassword("ENERGIA", null);
		System.out.println("ENERGIA :: " + passEncode);
		
		passEncode = passencoder.encodePassword("INGEN_USR", null);
		System.out.println("INGEN_USR :: " + passEncode);

	}

}
