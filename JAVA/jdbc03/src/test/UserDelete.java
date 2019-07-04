package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserDelete {
	public static void main(String[] args) {

		Biz<String, User> biz = new UserBiz();

		try {
			biz.remove("id66");
			System.out.println("Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		;
	}

}
