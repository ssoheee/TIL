package com.sds.app;

import java.util.ArrayList;
import java.util.Scanner;
import com.sds.frame.Biz;
import com.sds.omponant.UserBiz;
import com.sds.vo.User;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		out: while (true) {

			System.out.println("MENU: r, g, q");
			String cmd = sc.next();
			Biz<String, User> biz = new UserBiz();

			switch (cmd) {

			case "r":
				System.out.println("Input User Info");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();
				User u = new User(id, name, pwd);

				try {
					biz.register(u);
				} catch (Exception e) {
					System.out.println("Insert Error");
					System.out.println(e.getMessage());
				}
				break;

			case "g":
				ArrayList<User> list = null; // 받을 준비
				try {
					list = biz.get();
					for (User ug : list) {
						System.out.println(ug);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case "q":
				System.out.println("Bye..");
				break out;

			}

		}
		sc.close();

	}

}
