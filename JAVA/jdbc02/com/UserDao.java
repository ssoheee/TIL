package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import frame.Dao;
import frame.Sql;
import vo.User;

public class UserDao extends Dao<String, User> {

	// ����Ʈ ����Ʈ���ʹ� ���� Ŭ�������� �ڵ������� ���� ����

	@Override
	public void insert(User v) throws Exception {

		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.insertUser);
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally { // �� ó�� ���ϸ� ������ �߸� �Է��ص� close�� ���� �ȵ� !! �� ������� !!
			close(pstmt);
			close(con);
		}

	}

	
	@Override
	public void delete(String k) throws Exception {

		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.deleteUser);
			pstmt.setString(1, k); // ����� ���� ID�� �Է¹ޱ�
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}
	}
	

	@Override
	public void update(User v) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.updateUser);
			pstmt.setString(1, v.getPwd()); // ���� �ٲ� �н�����
			pstmt.setString(2, v.getName()); // ���� �ٲ� �̸�
			pstmt.setString(3, v.getId()); // ���⿡ ��� ID ������ ������Ʈ �� ������ ID���� �־������
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}
	}
	

	@Override
	public User select(String k) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rset = null;
		User suser = null; // SELECT �� ���� ������ ��Ƽ� �����ؾ� �ϹǷ� USER �ʿ�
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.selectUser);
			pstmt.setString(1, k); // �޾ƿ� ������ ID �Է�
			rset = pstmt.executeQuery();
			rset.next();
			String sid = rset.getString("ID");
			String spwd = rset.getString("PWD");
			String sname = rset.getString("NAME");
			suser = new User(sid, spwd, sname); // ������ ���� ���
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}
		return suser; // ���⼭ ����
	}

	
	@Override
	public ArrayList<User> select() throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rset = null;
		User suser = null;
		ArrayList<User> susers = new ArrayList<User>(); // !! ArrayList �ʱ�ȭ !!
		// SELECT�� ����ϰ� �޾ƿ� USER���� ��� �� �����ϴ� �迭����Ʈ

		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.selectAllUser);
			rset = pstmt.executeQuery();

			while (rset.next()) {

				String sid = rset.getString("ID");
				String spwd = rset.getString("PWD");
				String sname = rset.getString("NAME");
				suser = new User(sid, spwd, sname);
				susers.add(suser);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return susers;
	}

}
