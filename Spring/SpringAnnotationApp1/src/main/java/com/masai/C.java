package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class C {
	
	@Autowired
	private Environment env;
	
	public void funC() {
		System.out.println("Inside fun C..");
		
		System.out.println("State name: "+env.getProperty("b.state"));
		System.out.println("City name: "+env.getProperty("b.city"));
		System.out.println("pin code: "+env.getProperty("b.pin"));
	}
}
