package car;

import java.util.Random;

public class Car {
	
	String color;
	String model;
	int speed;
	boolean navigation;
	double number;
	boolean brk;
	Random r = new Random();
	
	Car(String color, boolean navigation, int speed, double number, boolean brk){ // �����ε� (arguement�� �ٸ��� �־��ָ� ������ ���� ����)
		this.color = color;
		this.navigation = navigation;
		this.speed = speed;
		this.number = number;
		this.brk = brk;
	} 

	
	void navigation() {
		navigation = !navigation; 
	}	

	void speedUp() {
		speed += 5;
		if (speed==80) {
			return;
		}
	}
	
	void speedDown() {
		speed -= 5;
		if (speed<=0) {
			speed=0;
			return;
		}
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	void setnumber()
	{
		number = (double) (r.nextInt(10000));
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + ", speed=" + speed + ", navigation=" + navigation
				+ ", number=" + number + ", brk=" + brk + "]";
	}
	
}

