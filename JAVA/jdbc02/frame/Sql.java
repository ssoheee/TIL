package frame;

public class Sql {

	public static String insertUser = "INSERT INTO T_USER VALUES (?,?,?)";
	public static String deleteUser = "DELETE FROM T_USER WHERE ID = ?";
	public static String updateUser = "UPDATE T_USER SET PWD = ?, NAME = ? WHERE ID = ?";
	public static String selectUser = "SELECT * FROM T_USER WHERE ID = ?";
	public static String selectAllUser = "SELECT * FROM T_USER";
	
	// STATIC -> 객체 생성 안하고도 사용 가능
	
	public static String insertProduct = "INSERT INTO T_PRODUCT VALUES (?,?,?,SYSDATE)";
	public static String deleteProduct = "DELETE FROM T_PRODUCT WHERE ID = ?";
	public static String updateProduct = "UPDATE T_PRODUCT SET NAME=?, PRICE=? WHERE ID=?";
	public static String selectProduct = "SELECT * FROM T_PRODUCT WHERE ID = ?";
	public static String selectAllUProduct = "SELECT * FROM T_PRODUCT";

}
