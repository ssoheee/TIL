package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

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
		
		// 3. SQL 전송
		String sql = "INSERT INTO T_PRODUCT VALUES (?,?,?,SYSDATE)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  "P11");
			pstmt.setString(2,  "PANTS10");
			pstmt.setInt(3,  10000); // 변수형에 따라 SET뒤에 바꿔줌, DATE는 SETDATE
//			pstmt.setString(4,  "2019-05-30"); // 날짜 포맷 중요
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 4. close
		try {
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
