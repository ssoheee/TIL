package shape;

public class Circle extends Shpae {

	private int radius;
	private String color;

	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(Point point, int radius) {
		super(point);
		this.radius = radius;
	}

	public Circle(Point point, int radius, String color) {
		super(point);
		this.radius = radius;
		this.color = color;
	}
	
	public void fillColor(String color) {
		this.color = color;
	}

	@Override
	public Point getPoint() {

		return super.getPoint();
	}

	@Override
	public void setPoint(Point point) {

		super.setPoint(point);

	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + ", color=" + color + "]";
	}

	@Override
	public double getArea() {
		double result = 0.0;
		result = Math.PI * this.radius * this.radius;
		return result;
	}

	@Override
	public double getCircume() {
		double result = 0.0;
		result = Math.PI * this.radius * 2;
		return result;
	}

}
