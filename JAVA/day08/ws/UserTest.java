package ws;

public class UserTest {

	public static void main(String[] args) throws Exception { // 한번에 조건체크

		User user1 = null;
		Engine e1 = new Engine(2000, 6);
		Engine e2 = new Engine(4000, 4);
		Car usersCars[] = new Car[2];
		usersCars[0] = new Car("K3", e1, "White");
		usersCars[1] = new Car("K5", e2, "Black");
		user1 = new User("ME", usersCars);
		System.out.print(user1);

	}

}
