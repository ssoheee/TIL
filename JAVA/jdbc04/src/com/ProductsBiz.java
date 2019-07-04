package com;

import java.sql.Connection;
import java.util.ArrayList;

import frame.Biz;
import frame.Dao;
import vo.Factory;
import vo.Products;

public class ProductsBiz extends Biz<Integer, Products> {

	Dao<Integer, Products> dao;
	FactoryBiz fb=new FactoryBiz(); 

	public ProductsBiz() {
		dao = new ProductsDao();
	}

	@Override
	public void register(Products v) throws Exception {

		Connection con = null;
		ArrayList<Factory> rset = new ArrayList<>();
		rset = fb.get();
		boolean notFactory = false;

		try {
			con = getCon();
			for (int i = 0; i < rset.size(); i++) {

				if (rset.get(i).getFactNo() == v.getFactNo()) {
					dao.insert(v, con);
					notFactory = true;
				}
			}

			if (!notFactory) {
				System.out.println("���� ������ �Է��߽��ϴ�.");
			}

		} catch (Exception e) {
			con.rollback(); // �������̸� rollback
			throw e;
		} finally {
			close(con);
		}
	}

	@Override
	public void remove(Integer k) throws Exception { //////////////����
		Connection con = null;
		try {
			con = getCon();
			dao.delete(k, con);
			con.commit();
		} catch (Exception e) {
			con.rollback();
			throw e;
		} finally {
			close(con);
		}
	}

	@Override
	public void modify(Products v) throws Exception {

		Connection con = null;
		ArrayList<Factory> rset = new ArrayList<>();
		rset = fb.get();
		boolean notFactory = false;
				
		try {
			con = getCon();
			for (int i = 0; i < rset.size(); i++) {

				if (rset.get(i).getFactNo() == v.getFactNo()) {
					dao.update(v, con);
					notFactory = true;
				}
			}

			if (!notFactory) {
				System.out.println("���� ������ �Է��߽��ϴ�.");
			}

		}catch (Exception e) {
			con.rollback();
			throw e;
		} finally {
			close(con);
		}

	}

	@Override
	public Products get(Integer k) throws Exception { /////////����

		Connection con = null;
		Products u = null;

		try {
			con = getCon();
			u = dao.select(k, con);// select�� commit,rollback(Transcation) �ʿ� X �׳� ����Ʈ ������

		} catch (Exception e) {
			throw e;
		} finally {
			close(con);
		}
		return u;
	}

	@Override
	public ArrayList<Products> get() throws Exception {

		Connection con = null;
		Products u = null;

		ArrayList<Products> list = new ArrayList<>();
		try {
			con = getCon();
			list = dao.select(con);

		} catch (Exception e) {
			throw e;
		} finally {
			close(con);
		}
		return list;
	}

}