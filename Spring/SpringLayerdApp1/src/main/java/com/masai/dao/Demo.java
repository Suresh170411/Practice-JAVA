package com.masai.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PresentationBean p1 = ctx.getBean("pb",PresentationBean.class);
		
		p1.presentationFunc();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}
	
}
