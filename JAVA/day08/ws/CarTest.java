package ws;

public class CarTest {

	public static void main(String[] args) {

		Engine eng1 = null;
		Car car1 = null, car2 = null;

		try {
			eng1 = new Engine(1000, 4);
			car1 = new Car("K1", eng1, "White");
			System.out.println(car1);
			car2 = new Car("K2", eng1, "White");
			System.out.println(car2);
		} catch (Exception e) {

		}

	}

}
