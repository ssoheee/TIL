package db2;

public class DBUser extends DB {

	public DBUser(String ip) {
		super(ip);
	}

	@Override
	public void insert(Object obj) {
		connection();
		User user = (User) obj;
		System.out.println(user.getId() + " Inserted");
		close();
	}

	@Override
	public Object select(Object obj) {
		User user = null;
		String str = (String) obj;
		connection();
		user = new User("id02", "tom", "pwd02"); // 원래는 DB에서 id02의 사용자를 가져와야 하지만, 우리는 임의로 설정		
		return user;
	}

}
