package com.masai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class B {
	
	@Value("${db.driverName}")
	private String name;
	
	@Value("${db.url}")
	private String url;
	
	@Value("${db.username}")
	private String username;
	
	@Value("${db.password}")
	private String password;
	
	public void funB() {
		System.out.println("Inside fun B...");
	}
	
	public void funBShow() {
		System.out.println(name);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
}
