package com.masai.dao;

public class PresentationBean {
	
	private ServiceBean service;

	public void setService(ServiceBean service) {
		this.service = service;
	}
	
	public void presentationFunc() {
		service.serviceBeanFunction();
		System.out.println("some calculation inside the PL..");
	}
	
}
