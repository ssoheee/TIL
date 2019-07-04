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

	@Override
	public void insert(User v, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.insertUser);
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
		}
	}

	@Override
	public void delete(String k, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.deleteUser);
			pstmt.setString(1, k);
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
		}
	}

	@Override
	public void update(User v, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.updateUser);
			pstmt.setString(1, v.getPwd()); // 새로 바꿀 패스워드
			pstmt.setString(2, v.getName()); // 새로 바꿀 이름
			pstmt.setString(3, v.getId()); // 여기에 어느 ID 정보를 업데이트 할 것인지 ID값을 넣어줘야함
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
	}

	@Override
	public User select(String k, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		User suser = null; // SELECT 할 유저 정보를 담아서 리턴해야 하므로 USER 필요
		try {
			pstmt = con.prepareStatement(Sql.selectUser);
			pstmt.setString(1, k); // 받아올 유저의 ID 입력
			rset = pstmt.executeQuery();
			rset.next();
			String sid = rset.getString("ID");
			String spwd = rset.getString("PWD");
			String sname = rset.getString("NAME");
			suser = new User(sid, spwd, sname); // 가져온 정보 담기
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return suser; // 여기서 리턴
	}

	@Override
	public ArrayList<User> select(Connection con) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		User suser = null;
		ArrayList<User> susers = new ArrayList<User>(); // !! ArrayList 초기화 !!
		try {
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
