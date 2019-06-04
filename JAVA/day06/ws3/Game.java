package ws3;

import java.util.Random;

public class Game {

	public static void main(String[] args) {

		Random r = new Random();
		int size = 8;
		int map[][] = new int[size][size]; // 8x8 정방행렬 (테두리만 표시)
		int point1 = 1000, point2 = 1000; // 플레이어 1,2에게 각각 포인트를 준다. (1000p)
		int nav[][] = new int[4][8];
		int player1 = 0, player2 = 0;
		int count1 = 0, count2 = 0;

		for (int i = 0; i < size; i++) {
			map[i][0] = r.nextInt(100) + 1;
			map[0][i] = r.nextInt(100) + 1;
			map[i][7] = r.nextInt(100) + 1;
			map[7][i] = r.nextInt(100) + 1;
		} // 테두리에 1-100까지 숫자 랜덤하게 배열

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.printf("%4d", map[i][j]);
			}
			System.out.println();
		}
		// 브루마블판 출력
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
		// (0,0) -> (0,7) -> (7,7) -> (7,0) 순으로 이동

//		for (int i = 0; i < nav.length; i++) {
//			for (int j = 0; j < nav[0].length; j++) {
//				System.out.printf("%4d", nav[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
		// nav에 잘 넣어졌는지 확인용

		while (true) {
			player1 = r.nextInt(6) + 1;
			player2 = r.nextInt(6) + 1;

			count1 += player1;
			count2 += player2;

			if (point1 <= 0 | point2 <= 0) {
				if (point1 <= 0) {
					System.out.println("Player1 패배");
				}
				if (point2 <= 0) {
					System.out.println("Player2 패배");
				}
				break;
			}
			// 계속해서 진행한 후 포인트가 0 이하가 된 플레이어 패배

			System.out.println("Player1 주사위 : " + player1 + "  Player2 주사위 : " + player2);

			// 각 플레이어가 주사위를 한 번씩 던져 나온 숫자만큼 이동
			// 해당 위치에 있는 숫자만큼 포인트 차감
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

			System.out.println("Player1 포인트 : " + point1 + "  Player2 포인트 : " + point2);
			System.out.println();

		}

	}

}
