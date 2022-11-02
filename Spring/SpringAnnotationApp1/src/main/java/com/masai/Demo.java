package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		A a1 = ctx.getBean("a",A.class);
		
		a1.funA();
		
		B b1 = ctx.getBean("b", B.class);
		
		b1.funBShow();
		
		C c1 = ctx.getBean("c", C.class);
		
		c1.funC();
		
		((AnnotationConfigApplicationContext)ctx).close();
		
	}
	
}
