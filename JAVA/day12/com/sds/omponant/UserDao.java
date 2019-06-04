package com.sds.omponant;

import java.util.ArrayList;

import com.sds.frame.Dao;
import com.sds.vo.User;

public class UserDao extends Dao<String, User> {

	@Override
	public void insert(User v) throws Exception {
		if (v.getId().equals("id02")) {
			throw new Exception("E0001");
		}
		System.out.println(v + " Inserted.");
	}

	@Override
	public void delete(String k) throws Exception {
		if (k.equals("id02")) {
			throw new Exception("E0002");
		}
		System.out.println(k + " Deleted.");
	}

	@Override
	public void update(User v) throws Exception {
		if (v.getId().equals("id02")) {
			throw new Exception("E0003");
		}
		System.out.println(v + " Updated.");
	}

	@Override
	public User select(String k) throws Exception {
		User user = new User(k, "Jmaes", "pw01");
		return user;
	}

	@Override
	public ArrayList<User> select() throws Exception {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("id01","t1","pw01"));
		list.add(new User("id02","t2","pw02"));
		list.add(new User("id03","t3","pw03"));
		list.add(new User("id04","t4","pw04"));
		list.add(new User("id05","t5","pw05"));
		return list;
	}

}
