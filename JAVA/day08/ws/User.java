package ws;

import java.util.Arrays;

public class User {
	
	private String userName;
	private Car[] cars;
	
	public User() {
	}
	public User(String userName, Car[] cars) {
		this.userName = userName;
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", cars=" + Arrays.toString(cars) + "]";
	}


}
