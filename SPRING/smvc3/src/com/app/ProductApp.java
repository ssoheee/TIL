package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Biz;
import com.vo.Product;

public class ProductApp {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		System.out.println("spring started");
		Biz<Integer, Product> biz = (Biz<Integer, Product>) factory.getBean("pbiz");

		
	}

}
