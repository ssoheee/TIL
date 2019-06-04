package car;

public class Car {

	// attribute -> ���Ƿ� �����ؼ��� �ȵ� (�׷��� private���� ����)
	private String name;
	private String color;
	private int fSize;
	private int cfSize;
	private int speed;
	private int maxSpeed;
	private int defaultSize =100;
	private int serial;
	private static int count = 1;
	// initialization block (�ʱ�ȭ ��)
	{
		count++;
		serial = count;
	} // �ν��Ͻ� ����
	
	static {
		count*=1000; // Ŭ���� ����
	} // ó�� �� ���� ����
	

	// constructor (return Ÿ���� ����)
	public Car() {
		this.name = "K1"; // this = ���� ������� ���۷����� �ּ�
		this.color = "red";
		this.fSize = 50;
		this.maxSpeed = 50;
	} // default

	public Car(String name, String color, int fSize) {
		this.name = name;
		this.color = color;
		this.fSize = fSize;
	} // �Լ��� �̸��� ������ argument�� �ٸ� -> �����ε� (���� �Ⱦ��� �ʿ��ϸ� �ϴ� �� ���������� ����?)

	public Car(String name, String color, int fSize, int maxSpeed) {
		this.name = name;
		this.color = color;
		this.fSize = fSize;
		this.maxSpeed = maxSpeed;
	}

	// function

	@Override
	      //����Ÿ��
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", fSize=" + fSize + ", cfSize=" + cfSize + ", speed=" + speed
				+ "]";
	}

	public String getName() { // �̸� �޾� ���� ��
		return name;
	}

	public void setName(String name) { // �̸� �ٲٴ� ��
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getfSize() {
		return fSize;
	}

	public void setfSize(int fSize) {
		this.fSize = fSize;
	}

	public int getCfSize() {
		return cfSize;
	}

	public void setCfSize(int cfSize) throws Exception {
		if ((this.cfSize + cfSize)>fSize) { // �����뺸�� �� �ִ� ���� ���� -> ����ó��
			throw new Exception();
		}
		this.cfSize += cfSize;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (this.maxSpeed<speed) {
			this.speed = maxSpeed;
			return;
		}
		this.speed = speed;
	}
	
	// �������� �Լ��� ����	
	public void go(int level) {
		// level 1~5
		// speed up 1:10km, 
		// fuel down 1L 10km
		switch(level) {
		case 1:
			this.setSpeed(20);
			this.cfSize -= 1;
			break;
		case 2:
			this.setSpeed(40);
			this.cfSize -= 2;
			break;
		case 3:
			this.setSpeed(60);
			this.cfSize -= 3;
			break;
		case 4:
			this.setSpeed(80);
			this.cfSize -= 4;
			break;
		case 5:
			this.setSpeed(100);
			this.cfSize -= 5;
			break;
		default:
			break;
		}
	}
	public void stop() {
		
		this.speed=0;
		
	}

}
