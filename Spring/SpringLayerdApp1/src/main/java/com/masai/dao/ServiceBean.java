package com.masai.dao;

public class ServiceBean {
	
	private DaoBean dao;
	
	
	public void setDao(DaoBean dao) {
		this.dao=dao;
	}
	
	public void serviceBeanFunction() {
		
		dao.fundAccount();
		
		System.out.println("calcutaon happed inside SL..");
	}
	
}
