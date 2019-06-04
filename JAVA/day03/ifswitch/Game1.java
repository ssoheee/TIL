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
		// 1. ����ڴ� 1-3 ���� �Է��Ѵ�.
		// 2. 1-3 �̿��� ���ڰ� ������ "�ȳ�" �� ���α׷� ����
		// 3. ��ǻ�ʹ� 1-3�� ���ڸ� �����ϰ� �����.
		// 4. ����� ���ڿ� ���Ͽ� �̰���� ������ ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����(1), ����(2), ��(3) !");
		int user = Integer.parseInt(sc.next());
		
		if(user>3 || user<0) {
			System.out.println("�ȳ�");
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
