package ws2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 9;
		char candy[][] = new char[size][size]; // 9x9 ĵ���� ����
		int from[] = new int[2];
		int to[] = new int[2];
		int x1 = 0, y1 = 0;
		int x2 = 0, y2 = 0;
		int cal1 = 0, cal2 = 0;
		char temp = 0;
		int count = 0;

		System.out.println("������ ĵ����");

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				candy[i][j] = (char) ((int) (Math.random() * 5) + 65);
				System.out.print(candy[i][j] + " ");
			}
			System.out.println();
		} // ĵ���ǿ� ABCDE�� �������� ĵ���ǿ� �ִ´�

		while (true) {
			System.out.println("�ٲٰ� ���� ���ĺ� ��ǥ�� �Է�");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			// ����ڰ� ���� ���� �ٲٰ� �;��ϴ� ���ĺ��� ��ǥ�� ����
			System.out.println("��� ��ġ�� �ű�� ������ �Է�");
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			// �� ���ĺ��� �̿� �˹��� ��ǥ ���� �ڸ��� �ٲ��� �Է�

			cal1 = Math.abs(x1 - x2);
			cal2 = Math.abs(y1 - y2);
			if ((cal1 == 0 | cal1 == 1) && (cal2 == 0 | cal2 == 1)) {
				break;
			} else {
				System.out.println("Error");
				continue;
			}

		} // ��, �̿��� ���ڸ� �ٲ� �� ����, �̿� ��쿡�� ���� �޼��� ���

		temp = candy[x1][y1];
		candy[x1][y1] = candy[x2][y2];
		candy[x2][y2] = temp;

		System.out.println("�ٲ� �迭");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(candy[i][j] + " ");
			}
			System.out.println();
		} // �ڸ� �ٲ㼭 ���

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 2; j++) {
				if (candy[i][j] == candy[i][j + 1] && candy[i][j] == candy[i][j + 2]) {
					count++;
				}
			}
		}

		System.out.println(count + "�� ����!"); // 3���� ���ڰ� �̿��Ǹ� �������� ���� ī��Ʈ �߰� �� ����

	}

}
