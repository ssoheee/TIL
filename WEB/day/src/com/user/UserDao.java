package com.user;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.frame.Dao;
import com.frame.Sql;
import com.vo.User;

public class UserDao extends Dao<String, User> {

	@Override
	public void insert(User v, Connection con) throws Exception { //�븵�뿉�꽌 以� 而ㅻ꽖�뀡�쑝濡� �븳嫄곗엫
			PreparedStatement pstmt = null;
			try {
			pstmt = con.prepareStatement(Sql.insertUser);
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.executeUpdate();
			}catch(Exception e) {
				throw e;
			}finally {
			close(pstmt);
			}
	}

	@Override
	public void delete(String k, Connection con) throws Exception {	
		PreparedStatement pstmt = null;		
			try {
			pstmt=con.prepareStatement(Sql.insertDelete);
			pstmt.setString(1, k);		
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			}
	}

	@Override
	public void update(User v, Connection con) throws Exception {		
			PreparedStatement pstmt = null;
			try {
				pstmt = con.prepareStatement(Sql.insertUpdate);
				pstmt.setString(1,v.getPwd());
				pstmt.setString(2, v.getName());
				pstmt.setString(3, v.getId());
				pstmt.executeUpdate();
			}catch(Exception e) {
				throw e;	
			}finally {
				close(pstmt);
			}		
	}

	@Override
	public User select(String k, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		User suser = null; 
		try {
			pstmt = con.prepareStatement(Sql.insertSelect);
			pstmt.setString(1, k);
			rset = pstmt.executeQuery();
			rset.next();
			String sid = rset.getString("ID");
			String spwd = rset.getString("PWD");
			String sname = rset.getString("NAME");
			suser = new User(sid, spwd, sname); 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return suser;
	}

	@Override
	public ArrayList<User> select(Connection con) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		User suser = null;
		ArrayList<User> susers = new ArrayList<User>(); 
		try {
			pstmt = con.prepareStatement(Sql.insertSelectAll);
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
		} finally {
			close(rset);
			close(pstmt);
		}
		return susers;
	}
}
