package db2;

public class App {
	


	public static void main(String[] args) {
		
		String id = "id02";
		String name = "tom";
		String pwd = "pwd03";
		DB db = new DBUser("192.100.100.1");

		User user = new User (id, name, pwd);
		db.insert(user);
		
		User dbuser = null;
		dbuser = (User) db.select("id02"); // id02인 사람의 정보를 가져와라
		System.out.println(dbuser);

	}

}
