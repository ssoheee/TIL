package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Biz;
import com.vo.User;

public class UserApp {

	public static void main(String[] args) {

		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		System.out.println("spring started");
		Biz<String, User> biz = (Biz<String, User>) factory.getBean("ubiz");

		ArrayList<User> list = null;
		try {
			list = biz.get();
			for (User u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * User user = new User("id88", "pw88", "¶ù½î"); try {
		 * System.out.println(biz.get()); } catch (Exception e) { e.printStackTrace(); }
		 */
		/*
		 * try { System.out.println(biz.get("asdf")); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */

		// User user =new User("id07","pw01","updatetest");
		/*
		 * try { System.out.println(biz.get("id07")); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */

		factory.close();
	}
}
