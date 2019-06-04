package time;

import java.util.Calendar;

public class Time {

	// 속성
	int hour;
	int min;
	int second;
	boolean power;
	String color;
	Calendar cal = Calendar.getInstance();

	// 초기화
	Time() {
		this.hour = cal.get(Calendar.HOUR);
		this.min = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
	}

	// 이제 여기서 제어 -> 펑션
	void power() {
		power = !power;
	}

	void showTime() {
		System.out.println(hour + " 시" + min + " 분" + second +  "초");
	}

	void alarm(int hour, int min) {
		while (true) {
			if (hour == cal.get(Calendar.HOUR) && min == cal.get(Calendar.HOUR)) {
				System.out.println("!! 알람 !!");
			}
		}
	}

//	void timer() {
//		
//	}
//	
//	void setTime (int hour, int min, int sec) {
//	}

}
