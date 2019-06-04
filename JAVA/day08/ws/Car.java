package ws;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Car {

	private String serial;
	private String name;
	private Engine engine;
	private String color;
	
	public static int cnt = 0;
	public static int serialNum2 = 1000;

	public Car() {
	}

	public Car(String name, Engine engine, String color) {

		long time = System.currentTimeMillis();
		SimpleDateFormat now = new SimpleDateFormat("yyyymmddhhmmss");

		String serialNum1 = now.format(new Date(time));
		serialNum2 = serialNum2 + cnt;

		this.name = name;
		this.engine = engine;
		this.color = color;
		this.serial = serialNum1 + serialNum2;

		cnt++;

	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car [serial=" + serial + ", name=" + name + ", engine=" + engine + ", color=" + color + "]";
	}

}
