package time;

import java.util.Scanner;

public class TmieApp {

	public static void main(String[] args) {

		Time time = new Time();
		String data = "";
		int sethour =0, setmin=0;
		
	

		time.showTime();
		System.out.println();

		System.out.println("원하는 기능을 입력하세요");
		Scanner sc = new Scanner(System.in);
		data = sc.next();

		if (data.equals("alarm")) {
			System.out.println("언제 알람을 울릴까요?");
			sethour = sc.nextInt();
			setmin = sc.nextInt();
			
			time.alarm(sethour, setmin);
		}

//			if (data.equals("timer")) {
//		System.out.println("지금부터 시간을 측정합니다");
////				
////			}
//
//		}

	}
}
