package time;

import java.util.Scanner;

public class TmieApp {

	public static void main(String[] args) {

		Time time = new Time();
		String data = "";
		int sethour =0, setmin=0;
		
	

		time.showTime();
		System.out.println();

		System.out.println("���ϴ� ����� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		data = sc.next();

		if (data.equals("alarm")) {
			System.out.println("���� �˶��� �︱���?");
			sethour = sc.nextInt();
			setmin = sc.nextInt();
			
			time.alarm(sethour, setmin);
		}

//			if (data.equals("timer")) {
//		System.out.println("���ݺ��� �ð��� �����մϴ�");
////				
////			}
//
//		}

	}
}
