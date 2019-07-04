package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Biz;
import com.frame.Search;
import com.vo.User;

public class UserApp {

	public static void main(String[] args) {

		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		System.out.println("spring started");
		/*Biz<String, User> biz = (Biz<String, User>) factory.getBean("ubiz");*/
		
		
		Search<String,User> biz =(Search<String,User>) factory.getBean("ubiz");
		ArrayList<User> list = null;
		
		list = biz.search("이");
		for (User u : list) {
			System.out.println(u);
		} // search 맵퍼에서 '이'가 들어간 이름을 찾아줌 그래서 name과 user필요

		/*
		 * User user = new User("id46", "pw00", "이말숙"); try {
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
