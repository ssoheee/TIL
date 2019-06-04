package shape;

public class ShapeTest {

	public static void main(String[] args) {

		
//		Shpae s = new Shpae(new Point(10,10)); 추상적이기 때문에 불가능
		
		// Heterogeneous Collection
		Shpae s[] = new Shpae[3];
		s[0] = new Circle(new Point(1,1),5);
		s[1] = new Triangle(new Point(2,2),5,6);
		s[2] = new Rectangle (new Point(3,3),5,6);
		
		// Polymorphism
		for (Shpae sh:s) {
			sh.move(5,5);
			if(sh instanceof Circle) { // sh가 만약 Circle이라면
				Circle c = (Circle) sh;
				c.fillColor("red");
			}
			System.out.println(sh.toString());
//			System.out.println(sh.getArea());
//			System.out.println(sh.getCircume());
		}

	}

}
