package com.masai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
	
	@Autowired
	private List<String> names;
	
	@PostConstruct
	public void mySetup() {
		System.out.println("Inside the in-it method..");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Inside the Destroy method..");
	}
	
	public void funA() {
		System.out.println("Inside fun A...");
		System.out.println(names);
	}
	
}
