package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		// ���ھ߱�

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num[] = new int[4];
		int user[] = new int[4];
		int bnum = 0, snum = 0;

		for (int i = 0; i < 4; i++) {
			num[i] = r.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		} // ���� 4�ڸ� ���� �ޱ� (�ߺ�x)

		System.out.println("4���� ���ڸ� �Է��ϼ���");

		for (int i = 0; i < 4; i++) {
			user[i] = Integer.parseInt(sc.next());
		} // ����ڰ� 4�ڸ� ���� �Է�

		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(user));

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (num[i] == user[j]) {
					bnum++;
					if (i == j) {
						bnum--;
						snum++;
					} // ���ڰ� ������ ball, �ڸ��� ������ strike
				}
			}
		}

		if (bnum == 0 && snum == 0) {
			System.out.println("OUT");
		} // �ƿ� �ȸ����� out
		else if (snum == 4) {
			System.out.println("HOME RUN"); // ������ ��ġ�ϰ� �Ǹ� Ȩ��
		} else {
			System.out.print(bnum + "B " + snum + "S");
		}

		sc.close();
	}

}

