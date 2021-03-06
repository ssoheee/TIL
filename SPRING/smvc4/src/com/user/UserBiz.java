package com.user;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.frame.Biz;
import com.frame.Dao;
import com.vo.User;

@Service("ubiz")
public class UserBiz implements Biz<String, User> {

	@Resource(name = "udao") // 이거 썼기 때문에 getter, setter, constructor 필요없음
	Dao<String,User> dao;
	
	@Override
	public void register(User v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(User v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
	}

	@Override
	public User get(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<User> get() throws Exception {
		return dao.select();
	}
}
