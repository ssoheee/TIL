package shape;

public class User {

	String id;

	public User() {
		id = "Kim";

	}

	public void draw(Shpae shape) {
		
		// Shape s = T, R, C
		// Shape shape ���� T, R, C�� �� �� ����
		// Polymorphism (������)
		System.out.println(shape.getArea());
		System.out.println(shape.getCircume());
		System.out.println(shape.getPoint());
		
	}

}
