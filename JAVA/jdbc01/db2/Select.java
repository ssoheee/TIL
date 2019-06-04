package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) {

		// 1. JDBC Driver Loading..
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Error");
		}

		// 2. Connection 1524(Listenr 포트 넘버) db db
		String id = "db";
		String password = "db";
		String url = "jdbc:oracle:thin:@70.12.50.229:1521:xe"; // db마다 바뀜

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}

		// 3. SQL 전송 & Receive
		String sql = "SELECT * FROM T_PRODUCT WHERE ID=?";
		PreparedStatement pstmt = null; // 전송용
		ResultSet rset = null; // 리시브용
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "P01");
			rset = pstmt.executeQuery(); // ID01의 정보를 다 가지고 있음
			rset.next();
			String pid = rset.getString("ID");
			String pname = rset.getString("NAME");
			String pprice = rset.getString("PRICE");
			System.out.println(pid + " " + pname + " " + pprice);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 4. close
		try {
			rset.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
