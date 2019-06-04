package ws;

import ws.DB;
import ws.User;
import ws.UserDB;
import ws.Product;
import ws.ProductDB;

public class App {

	public static void main(String[] args) {
		
		DB <User,String> db = new UserDB();
		User user1 = new User("id01", "james", "pwd01");
		User user2 = new User("id02", "james", "pwd02");
		User user3 = new User("id03", "james", "pwd03");
		User user4 = new User("id04", "james", "pwd04");
		User user5 = new User("id05", "james", "pwd05");

	}

}
