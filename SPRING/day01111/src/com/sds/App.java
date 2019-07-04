package com.sds;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("bizdaospring.xml");
		System.out.println("System Started");
		
		Biz biz1 = (Biz)factory.getBean("uod");
		biz1.register();
		
		Biz biz2 = (Biz)factory.getBean("umd");
		biz2.register();
		
	}

}
