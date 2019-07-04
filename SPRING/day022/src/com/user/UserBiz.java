package com.user;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;

@Service("ubiz")
public class UserBiz implements Biz<String, User> {

	@Resource(name="uod")	// uod dao�� ����ϰڴ�
	Dao<String, User> dao;

	//��ü ���� �� �� �� ���ʷ� ����
	public void startBiz() {
		System.out.println("Start Biz ...");
	}
	//��ü�� �Ҹ�Ǵ� ������ �� �� ����
	public void endBiz() {
		System.out.println("End Biz ...");
	}
	public void setDao(Dao<String, User> dao) {
		this.dao = dao;
	}

	@Override
	public void insert(User v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void update(User v) throws Exception {
		dao.update(v);

	}

	@Override
	public void delete(String k) throws Exception {
		dao.delete(k);
	}

	@Override
	public User select(String k) throws Exception {
		System.out.println("--------Biz Selected---------");
		Thread.sleep(2800);
		/*
		 * if (k.equals("id00")) { throw new Exception("Not Found Exception"); }
		 */
		return dao.select(k);
	}

	@Override
	public ArrayList<User> select() throws Exception {
		return dao.select();
	}

}
