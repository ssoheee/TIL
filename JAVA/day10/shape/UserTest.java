package shape;

public class UserTest {

	public static void main(String[] args) {

		User u = new User();
		u.draw(new Circle(5)); // 다형성 때문에 이 구문이 가능
		
	}

}
