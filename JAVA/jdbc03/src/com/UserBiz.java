package com;

import java.sql.Connection;
import java.util.ArrayList;

import frame.Biz;
import frame.Dao;
import vo.User;

public class UserBiz extends Biz<String, User> {

	Dao<String, User> dao;

	public UserBiz() {
		dao = new UserDao();
	}

	@Override
	public void register(User v) throws Exception {
		Connection con = null;
		try {
			con = getCon(); // 기존과 달리 커넥션을 여기서 만들어서 넣어줌
			dao.insert(v, con);
			// dao.insert(v, con); 테스트용
			con.commit();
		} catch (Exception e) {
			con.rollback(); // 에러 발생하면 이전에 했던 것 다시 rollback
			throw e;
		} finally {
			close(con);
		}
	}

	@Override
	public void remove(String k) throws Exception {
		Connection con = null;
		try {
			con = getCon(); // 기존과 달리 커넥션을 여기서 만들어서 넣어줌
			dao.delete(k, con);
			con.commit();
		} catch (Exception e) {
			con.rollback(); // 에러 발생하면 이전에 했던 것 다시 rollback
			throw e;
		} finally {
			close(con);
		}
	}

	@Override
	public void modify(User v) throws Exception {
		Connection con = null;
		try {
			con = getCon(); // 기존과 달리 커넥션을 여기서 만들어서 넣어줌
			dao.update(v, con);
			con.commit();
		} catch (Exception e) {
			con.rollback(); // 에러 발생하면 이전에 했던 것 다시 rollback
			throw e;
		} finally {
			close(con);
		}
	}

	@Override
	public User get(String k) throws Exception {
		Connection con = null;
		User u = null;
		try {
			con = getCon();
			u = dao.select(k, con); // 결과값만 가져오면 되므로 커밋, 롤백 필요없음
		} catch (Exception e) {
			throw e;
		} finally {
			close(con);
		}
		return u;
	}

	@Override
	public ArrayList<User> get() throws Exception {
		Connection con = null;
		ArrayList<User> users = new ArrayList<User>();
		try {
			con = getCon();
			users = dao.select(con); // 결과값만 가져오면 되므로 커밋, 롤백 필요없음
		} catch (Exception e) {
			throw e;
		} finally {
			close(con);
		}
		return users;
	}

}
