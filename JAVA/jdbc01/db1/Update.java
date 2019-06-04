package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		// 1. JDBC Driver Loading..
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Error");
		}

		// 2. Connection 1524(Listenr ��Ʈ �ѹ�) db db
		String id = "db";
		String password = "db";
		String url = "jdbc:oracle:thin:@70.12.50.229:1521:xe"; // db���� �ٲ�

		Connection con = null;

		try {
			con = DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}
		
		// 3. SQL ����
		String sql = "UPDATE T_USER SET PWD=?, NAME=? WHERE ID=?"; // �� �� SQL �ڵ忣 ; �� ����
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  "0000");
			pstmt.setString(2,  "ME");
			pstmt.setString(3,  "ID01");
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
