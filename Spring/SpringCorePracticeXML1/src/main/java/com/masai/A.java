package com.masai;

public class A {
	
	private Student s;
	
	public void setS(Student s) {
		this.s = s;
	}

	public void funA() {
		System.out.println("Inside funA...");
		System.out.println();
		System.out.println("roll : "+s.getRoll());
		System.out.println("name : "+s.getName());
		System.out.println("marks : "+s.getMarks());
	}
	
}
