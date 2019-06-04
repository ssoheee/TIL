package test;

import com.UserDao;

import frame.Dao;
import vo.User;

public class UserDelete {

	public static void main(String[] args) {
		Dao<String, User> dao = new UserDao();
//		User user = new User("ID55", "PWD55", "ÀÌ¸»¼÷");
		try {
			dao.delete("ID55");
			;
			System.out.println("User Deleted");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
