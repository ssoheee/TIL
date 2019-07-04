package com.user;

import com.user.UserDao;
import com.frame.Biz;
import com.frame.Dao;
import com.vo.User;

public class InsertTest {
	public static void main(String[] args) {

		Biz<String, User> biz = new UserBiz();
		User user = new User("ID05", "1111", "NEW");
		try {
			biz.register(user);
			;
			System.out.println("User Updated");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
