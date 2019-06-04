package shape;

public abstract class Shpae {
	
	protected Point point;

	public Shpae() {
	}

	public Shpae(Point point) {
		this.point = point;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Shpae [point=" + point + "]";
	}
	
	public void move(int x, int y) {
		this.point.setX(x);;
		this.point.setY(y);;
	}
	
	public abstract double getArea(); // 추상함수
	public abstract double getCircume();

}
