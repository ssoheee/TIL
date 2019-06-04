package set;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {

		ArrayList<User> list = new ArrayList<>(); // 사이즈를 정하지 않아도 됨, 타입 캐스팅 따로 안해도 됨

		list.add(new User("id01", "james", "pwd01"));
		list.add(new User("id02", "james", "pwd01"));
		list.add(new User("id03", "james", "pwd01"));
		list.add(new User("id04", "james", "pwd01"));
		list.add(new User("id05", "james", "pwd01"));

		System.out.println(list.size());
		list.remove(3);
		for (User u : list) {
			System.out.println(u);
		}
	}

}
