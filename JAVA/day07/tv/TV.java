package tv;

public class TV {
	
	// �Ӽ� (attribute)
	private String color;
	private boolean power;
	private int channel; // public�� ������ ���� ��Ű�������� ���� ����
	
	
	// constructor (attribute �ʱ�ȭ), Ŭ���� �̸��� ���������� �Լ���, return type �������� ����
	TV(){ 
		color = "red";
		power = false;
		channel = 10;
	}
	
	TV(String color, boolean power, int channel){ // �����ε� (arguement�� �ٸ��� �־��ָ� ������ ���� ����)
		this.color = color;
		this.power = power;
		this.channel = channel;
	} // ���� ���� �� �ְ� �־���
	
	TV(String color){ // �÷��� �ް� power�� channel�� ������Ű�� ����
		this.color = color;
		this.power = false;
		this.channel = 10;
	} 
	
	
	// function (behavior)	
	void power() {
		power = !power; // �� ����� ������ true->false false->true
	}	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		// ���� �� ������ �Ѵ�.
		// �÷��� ��� ���ؼ� �����Ѵ�.
		if (color.contentEquals("") || color == null) { // �÷��� �� �� ������ �ϴ°� ���´�
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


