package com.sds.omponant;

import java.util.ArrayList;

import com.sds.frame.Biz;
import com.sds.frame.Dao;
import com.sds.vo.User;

public class UserBiz extends Biz<String, User> {

	Dao<String, User> dao; // UML ȭ��ǥ ������ ���� Biz�� Dao�� �ʿ�� ��

	public UserBiz() {
		dao = new UserDao();
	}

	@Override
	public void register(User v) throws Exception {
		checkData(v);
		transactionStart(); // transaction�� �����͸� ������ �� �ʿ���
		try {
			dao.insert(v); // try ���� ���ϸ� throw�� Dao���� ���ƿ��� ���⼭�� ���� �ʰ� �ٽ� �������� -> ���� ���� ������ �ȵǹ���
		} catch (Exception e) {
			throw e;
		} finally { // exception�� throw �ϰ����� �����Ű���� (������ ����ų� �Ȼ���ų� �� �� ����Ǿ����)
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
	public User get(String k) throws Exception { // �ܼ��� �ҷ������̹Ƿ� transaction ���ʿ�
		return dao.select(k);
	}

	@Override
	public ArrayList<User> get() throws Exception {
		return dao.select();
	}

}
