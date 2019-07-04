package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import frame.Dao;
import frame.Sql;
import vo.Product;

public class ProductDao extends Dao<String, Product> {

	@Override
	public void insert(Product v) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.insertProduct);
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getName());
			pstmt.setDouble(3, v.getPrice());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
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
			pstmt = con.prepareStatement(Sql.deleteProduct);
			pstmt.setString(1, k);
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}
	}

	@Override
	public void update(Product v) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.updateProduct);
			pstmt.setString(1, v.getName());
			pstmt.setDouble(2, v.getPrice());
			pstmt.setString(3, v.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}

	}

	@Override
	public Product select(String k) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rset = null;
		Product sp = null; // SELECT 할 유저 정보를 담아서 리턴해야 하므로 USER 필요
		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.selectProduct);
			pstmt.setString(1, k);
			rset = pstmt.executeQuery();
			rset.next();
			String spid = rset.getString("ID");
			String spname = rset.getString("NAME");
			double spprice = rset.getDouble("PRICE");
			Date spdate = rset.getDate("REGDATE");
			sp = new Product(spid, spname, spprice, spdate);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}
		return sp;
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rset = null;
		Product sp = null;
		ArrayList<Product> sps = new ArrayList<Product>(); // !! ArrayList 초기화 !!

		try {
			con = getCon();
			pstmt = con.prepareStatement(Sql.selectAllUProduct);
			rset = pstmt.executeQuery();

			while (rset.next()) {
				String spid = rset.getString("ID");
				String spname = rset.getString("NAME");
				double spprice = rset.getDouble("PRICE");
				Date spdate = rset.getDate("REGDATE");
				sp = new Product(spid, spname, spprice, spdate);
				sps.add(sp);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sps;
	}
}
