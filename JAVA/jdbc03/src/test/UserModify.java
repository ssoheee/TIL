package test;

import com.UserBiz;

import frame.Biz;
import vo.User;

public class UserModify {

	public static void main(String[] args) {

		Biz<String, User> biz = new UserBiz();
		User user = new User("ID78", "7878", "À¯Àú");
		try {
			biz.modify(user);
			System.out.println("Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		;
	}

}

