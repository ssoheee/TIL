package ifswitch;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
/*		// 1. Math.random
		int num = 0;
		num = (int) (Math.random()*10)+1;
		System.out.println(num);
		
		// 2. Random
		Random r = new Random();
		int num2 = 0;
		num2 = r.nextInt(3)+1; 
		System.out.println(num2);
*/		
		// 1. 사용자는 1-3 값을 입력한다.
		// 2. 1-3 이외의 문자가 들어오면 "안녕" 후 프로그램 종료
		// 3. 컴퓨터는 1-3의 숫자를 랜덤하게 만든다.
		// 4. 사용자 숫자와 비교하여 이겼는지 졌는지 출력한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) !");
		int user = Integer.parseInt(sc.next());
		
		if(user>3 || user<0) {
			System.out.println("안녕");
			sc.close();
			return;
		}
		
		Random r = new Random();
		int com = r.nextInt(3)+1;
		
		System.out.printf("User :%d\n",  user);
		System.out.printf("Computer :%d\n",  com);
		
		switch(user-com) {
		case 0 :
			System.out.println("Draw");
			break;
		case -2 : case 1:
			System.out.println("Win");
			break;
		case -1 : case 2 :
			System.out.println("Lose");
			break;
		}
		
		sc.close();

	}

}
