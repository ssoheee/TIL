package time;

import java.util.Calendar;

public class Time {

	// �Ӽ�
	int hour;
	int min;
	int second;
	boolean power;
	String color;
	Calendar cal = Calendar.getInstance();

	// �ʱ�ȭ
	Time() {
		this.hour = cal.get(Calendar.HOUR);
		this.min = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
	}

	// ���� ���⼭ ���� -> ���
	void power() {
		power = !power;
	}

	void showTime() {
		System.out.println(hour + " ��" + min + " ��" + second +  "��");
	}

	void alarm(int hour, int min) {
		while (true) {
			if (hour == cal.get(Calendar.HOUR) && min == cal.get(Calendar.HOUR)) {
				System.out.println("!! �˶� !!");
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
