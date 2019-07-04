package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserGetAll {

	public static void main(String[] args) {

		Biz<String, User> biz = new UserBiz();

		try {
			System.out.println(biz.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
