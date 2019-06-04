package ws1;

import shape.Circle;
import shape.Shpae;

public class TransTest {

	public static void main(String[] args) {

		Subway s = new Subway(new Factor(30, 30));
		System.out.println(s);

		Bus b = new Bus(new Factor(30, 30));

		System.out.println(b);
	}

}
