package shape;

public class User {

	String id;

	public User() {
		id = "Kim";

	}

	public void draw(Shpae shape) {
		
		// Shape s = T, R, C
		// Shape shape 에는 T, R, C가 들어갈 수 있음
		// Polymorphism (다형성)
		System.out.println(shape.getArea());
		System.out.println(shape.getCircume());
		System.out.println(shape.getPoint());
		
	}

}
