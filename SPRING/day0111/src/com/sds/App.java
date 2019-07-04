package com.sds;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		System.out.println("Spring Started");

		/*
		 * TV tv = (TV)factory.getBean("ltv"); // �������̽� ���� �Լ��� ȣ�� ���� // ltv���� ������ �Լ��� ȣ��
		 * �Ұ� tv.turnOn(); TV tv2 = (TV)factory.getBean("ltv"); tv2.turnOn(); // xml����
		 * scope="prototype" �ٲٸ� �̸� �������� �ʰ� �ϳ��� �����س� if (tv==tv2) {
		 * System.out.println("ok"); }
		 */
		// Spring�� ������ ������ ��� xml�� �Ѵ�
		TV tv = (TV)factory.getBean("stv");
		tv.up();
		System.out.println(tv);
		
		TV tv2 = (TV)factory.getBean("ltv");
		tv2.up();
		System.out.println(tv2);
	}
}
