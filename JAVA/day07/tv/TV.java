package tv;

public class TV {
	
	// 속성 (attribute)
	private String color;
	private boolean power;
	private int channel; // public이 없으면 같은 패키지에서만 접근 가능
	
	
	// constructor (attribute 초기화), 클래스 이름과 동일하지만 함수형, return type 존재하지 않음
	TV(){ 
		color = "red";
		power = false;
		channel = 10;
	}
	
	TV(String color, boolean power, int channel){ // 오버로딩 (arguement를 다르게 넣어주면 오류가 뜨지 않음)
		this.color = color;
		this.power = power;
		this.channel = channel;
	} // 값을 받을 수 있게 넣어줌
	
	TV(String color){ // 컬러만 받고 power와 channel은 고정시키고 시작
		this.color = color;
		this.power = false;
		this.channel = 10;
	} 
	
	
	// function (behavior)	
	void power() {
		power = !power; // 이 기능을 누르면 true->false false->true
	}	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		// 숫자 못 들어오게 한다.
		// 컬러는 몇개로 정해서 동작한다.
		if (color.contentEquals("") || color == null) { // 컬러를 잘 못 들어오게 하는걸 막는다
			return;
		}
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	void channelUp() {
		channel++;
	}	
	void channelDown() {
		channel--;
	}

	@Override
	public String toString() {
		return "TV [color=" + color + ", power=" + power + ", channel=" + channel + "]";
	}
	
	

}


