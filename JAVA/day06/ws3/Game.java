package ws3;

import java.util.Random;

public class Game {

	public static void main(String[] args) {

		Random r = new Random();
		int size = 8;
		int map[][] = new int[size][size]; // 8x8 ������� (�׵θ��� ǥ��)
		int point1 = 1000, point2 = 1000; // �÷��̾� 1,2���� ���� ����Ʈ�� �ش�. (1000p)
		int nav[][] = new int[4][8];
		int player1 = 0, player2 = 0;
		int count1 = 0, count2 = 0;

		for (int i = 0; i < size; i++) {
			map[i][0] = r.nextInt(100) + 1;
			map[0][i] = r.nextInt(100) + 1;
			map[i][7] = r.nextInt(100) + 1;
			map[7][i] = r.nextInt(100) + 1;
		} // �׵θ��� 1-100���� ���� �����ϰ� �迭

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.printf("%4d", map[i][j]);
			}
			System.out.println();
		}
		// ��縶���� ���
		System.out.println();

		for (int i = 1; i < 8; i++) {
			nav[0][i] = map[0][i];
		}
		for (int i = 1; i < 8; i++) {
			nav[1][i] = map[i][7];
		}
		for (int i = 1; i < 8; i++) {
			nav[2][i] = map[7][7 - i];
		}
		for (int i = 1; i < 8; i++) {
			nav[3][i] = map[7 - i][0];
		}
		// (0,0) -> (0,7) -> (7,7) -> (7,0) ������ �̵�

//		for (int i = 0; i < nav.length; i++) {
//			for (int j = 0; j < nav[0].length; j++) {
//				System.out.printf("%4d", nav[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
		// nav�� �� �־������� Ȯ�ο�

		while (true) {
			player1 = r.nextInt(6) + 1;
			player2 = r.nextInt(6) + 1;

			count1 += player1;
			count2 += player2;

			if (point1 <= 0 | point2 <= 0) {
				if (point1 <= 0) {
					System.out.println("Player1 �й�");
				}
				if (point2 <= 0) {
					System.out.println("Player2 �й�");
				}
				break;
			}
			// ����ؼ� ������ �� ����Ʈ�� 0 ���ϰ� �� �÷��̾� �й�

			System.out.println("Player1 �ֻ��� : " + player1 + "  Player2 �ֻ��� : " + player2);

			// �� �÷��̾ �ֻ����� �� ���� ���� ���� ���ڸ�ŭ �̵�
			// �ش� ��ġ�� �ִ� ���ڸ�ŭ ����Ʈ ����
			if (count1 >= 28) {
				count1 -= 28;
			}
			if (count2 >= 28) {
				count2 -= 28;
			}

			if (count1 > 0 && count1 < 8) {
				point1 = point1 - nav[0][count1];
			}
			if (count2 > 0 && count2 < 8) {
				point2 = point2 - nav[0][count2];
			}

			if (count1 > 7 && count1 < 15) {
				point1 = point1 - nav[1][count1 - 7];
			}
			if (count2 > 7 && count2 < 15) {
				point2 = point2 - nav[1][count2 - 7];
			}

			if (count1 > 15 && count1 < 22) {
				point1 = point1 - nav[2][count1 - 14];
			}
			if (count2 > 15 && count2 < 22) {
				point2 = point2 - nav[2][count2 - 14];
			}

			if (count1 > 21 && count1 < 29) {
				point1 = point1 - nav[3][count1 - 21];
			}
			if (count2 > 21 && count2 < 29) {
				point2 = point2 - nav[3][count2 - 21];
			}

			System.out.println("Player1 ����Ʈ : " + point1 + "  Player2 ����Ʈ : " + point2);
			System.out.println();

		}

	}

}
