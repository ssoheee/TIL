package car;

public class Car {

	// attribute -> 임의로 변경해서는 안됨 (그래서 private으로 설정)
	private String name;
	private String color;
	private int fSize;
	private int cfSize;
	private int speed;
	private int maxSpeed;
	private int defaultSize =100;
	private int serial;
	private static int count = 1;
	// initialization block (초기화 블럭)
	{
		count++;
		serial = count;
	} // 인스턴스 변수
	
	static {
		count*=1000; // 클래스 변수
	} // 처음 한 번만 동작
	

	// constructor (return 타입이 없음)
	public Car() {
		this.name = "K1"; // this = 현재 만들어진 레퍼런스의 주소
		this.color = "red";
		this.fSize = 50;
		this.maxSpeed = 50;
	} // default

	public Car(String name, String color, int fSize) {
		this.name = name;
		this.color = color;
		this.fSize = fSize;
	} // 함수의 이름이 같지만 argument가 다름 -> 오버로드 (쓰던 안쓰던 필요하면 일단 다 만들어놓으면 좋음?)

	public Car(String name, String color, int fSize, int maxSpeed) {
		this.name = name;
		this.color = color;
		this.fSize = fSize;
		this.maxSpeed = maxSpeed;
	}

	// function

	@Override
	      //리턴타입
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", fSize=" + fSize + ", cfSize=" + cfSize + ", speed=" + speed
				+ "]";
	}

	public String getName() { // 이름 받아 오는 것
		return name;
	}

	public void setName(String name) { // 이름 바꾸는 것
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
		if ((this.cfSize + cfSize)>fSize) { // 연료통보다 더 넣는 것을 방지 -> 예외처리
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
	
	// 실질적인 함수의 시작	
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
