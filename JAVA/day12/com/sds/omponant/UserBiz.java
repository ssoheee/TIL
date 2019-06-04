package com.sds.omponant;

import java.util.ArrayList;

import com.sds.frame.Biz;
import com.sds.frame.Dao;
import com.sds.vo.User;

public class UserBiz extends Biz<String, User> {

	Dao<String, User> dao; // UML 화살표 방향을 보면 Biz는 Dao를 필요로 함

	public UserBiz() {
		dao = new UserDao();
	}

	@Override
	public void register(User v) throws Exception {
		checkData(v);
		transactionStart(); // transaction은 데이터를 조작할 때 필요함
		try {
			dao.insert(v); // try 실행 안하면 throw가 Dao에서 날아오면 여기서도 받지 않고 다시 날려버림 -> 다음 줄이 실행이 안되버림
		} catch (Exception e) {
			throw e;
		} finally { // exception을 throw 하고나서도 실행시키도록 (문제가 생기거나 안생기거나 둘 다 실행되어야함)
			transactionEnd();
		}
	}

	@Override
	public void remove(String k) throws Exception {
		transactionStart();
		try {
			dao.delete(k);
		} catch (Exception e) {
			throw e;
		} finally {
			transactionEnd();
		}
	}

	@Override
	public void modify(User v) throws Exception {
		checkData(v);
		transactionStart();
		try {
			dao.update(v);
		} catch (Exception e) {
			throw e;
		} finally {
			transactionEnd();
		}

	}

	@Override
	public User get(String k) throws Exception { // 단순히 불러오기이므로 transaction 불필요
		return dao.select(k);
	}

	@Override
	public ArrayList<User> get() throws Exception {
		return dao.select();
	}

}
