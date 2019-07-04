package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import frame.Dao;
import frame.Sql;
import vo.Products;

public class ProductsDao extends Dao<Integer, Products> {

	@Override
	public void insert(Products v, Connection con) throws Exception {

		PreparedStatement pstmt = null;

		try {

			pstmt = con.prepareStatement(Sql.insertProducts);
			pstmt.setInt(1, v.getPdNo());
			pstmt.setString(2, v.getPdName());
			pstmt.setString(3, v.getPdsUBName());
			pstmt.setString(4, v.getFactNo());
			pstmt.setDate(5, (Date) v.getPdDate());
			pstmt.setInt(6, v.getPdCost());
			pstmt.setInt(7, v.getPdPrice());
			pstmt.setInt(8, v.getPdAmount());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
		}

	}

	@Override
	public void delete(Integer k, Connection con) throws Exception {
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = con.prepareStatement(Sql.deleteProducts);
			pstmt.setInt(1, k);
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
		}
	}

	@Override
	public void update(Products v, Connection con) throws Exception {
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = con.prepareStatement(Sql.updateProducts);
			pstmt.setInt(1, v.getPdNo());
			pstmt.setString(2, v.getPdName());
			pstmt.setString(3, v.getPdsUBName());
			pstmt.setString(4, v.getFactNo());
			pstmt.setDate(5, (Date) v.getPdDate());
			pstmt.setInt(6, v.getPdCost());
			pstmt.setInt(7, v.getPdPrice());
			pstmt.setInt(8, v.getPdAmount());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
		}
	}

	@Override
	public Products select(Integer k, Connection con) throws Exception {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Products list = null;

		try {
			pstmt = con.prepareStatement(Sql.selectProducts);
			pstmt.setInt(1, k);
			rset = pstmt.executeQuery();

			rset.next();

			int uid = rset.getInt("PDNO");
			String upwd = rset.getString("PDNAME");
			String uname = rset.getString("PDSUBNAME");
			String uno = rset.getString("FACTNO");
			Date upddate = rset.getDate("PDDATE");
			int updcost = rset.getInt("PDCOST");
			int updprice = rset.getInt("PDPRICE");
			int updamount = rset.getInt("PDAMOUNT");
			list = new Products(uid, upwd, uname, uno, upddate, updcost, updprice, updamount);

		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(rset);
		}
		return list;

	}

	@Override
	public ArrayList<Products> select(Connection con) throws Exception {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Products> list = new ArrayList<>();

		try {
			pstmt = con.prepareStatement(Sql.selectAllUProducts);
			rset = pstmt.executeQuery();

			while (rset.next()) {
				int uid = rset.getInt("PDNO");
				String upwd = rset.getString("PDNAME");
				String uname = rset.getString("PDSUBNAME");
				String uno = rset.getString("FACTNO");
				Date upddate = rset.getDate("DATE");
				int updcost = rset.getInt("PDCOST");
				int updprice = rset.getInt("PDPRICE");
				int updamount = rset.getInt("PDAMOUNT");
				list.add(new Products(uid, upwd, uname, uno, upddate, updcost, updprice, updamount));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(rset);
		}
		return list;

	}

}