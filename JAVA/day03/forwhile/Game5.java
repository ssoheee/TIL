package forwhile;

import java.util.Random;
import java.util.Scanner;

public class Game5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0, winnum = 0;
		int user = 0, com = 0;
		Random r = new Random();
		String str = "", result = "";

		while (true) {
			System.out.println("����(1), ����(2), ��(3) !");

			str = sc.next();
			if (str.equals("q")) {
				System.out.println("Bye");
				sc.close();
				break;
			} 
			
			user = Integer.parseInt(str); // �̰� ����Ʈ !!!!!!!!!!!!!!

			if (user > 3 | user < 0) {
				System.out.println("�ٽ� �Է��ϼ���");
				System.out.println();
			}

			else {
				com = r.nextInt(3) + 1;
				if (user - com == 0) {
					result = "Draw";
				} else if (user - com == -2 | user - com == 1) {
					result = "Win";
					winnum += 1;
				} else if (user - com == -1 | user - com == 2) {
					result = "Lose";
				}
				total += 1;

				System.out.printf("User :%d\n", user);
				System.out.printf("Computer :%d\n", com);
				System.out.println("�����?! " + result);
				System.out.println("�� ��° ����? " + total);
				System.out.println("�� �� �̰����? " + winnum);
				System.out.println();

			}

		}

	}

}
