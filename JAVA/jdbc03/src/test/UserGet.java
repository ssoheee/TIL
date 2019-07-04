package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserGet {

	public static void main(String[] args) {
	
		Biz<String, User> biz = new UserBiz();
		try {
			System.out.println(biz.get("ID01"));
			System.out.println("Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		;

	}

}
