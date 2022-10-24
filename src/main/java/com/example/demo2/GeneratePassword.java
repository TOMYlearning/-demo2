package com.example.demo2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneratePassword {
	public static void main (String[] orgs) {
		
		String rawPassword = "admin";
		
		String password = getEncodePassword(rawPassword);
		
		System.out.println(password);
	}
	
	private static String getEncodePassword(String rawPassword) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(rawPassword);
	}
	
}
