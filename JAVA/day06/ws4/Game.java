package ws4;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String data;
		Random r = new Random();
		int size = 8;
		int map[][] = new int[size][size]; // 8x8 정방행렬 (테두리만 표시)
		int money1 = 5000, money2 = 1000; // 플레이어 1,2에게 각각 포인트를 준다. (1000p)
		int nav[][] = new int[4][8];
		int player1 = 0, player2 = 0;
		int count1 = 0, count2 = 0;
		int now1 = 0, now2 = 0;

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
		} // 브루마블판 출력
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
		} // (0,0) -> (0,7) -> (7,7) -> (7,0) 순으로 이동
		

		while (true) {
			player1 = r.nextInt(6) + 1;
			player2 = r.nextInt(6) + 1;

			count1 += player1;
			count2 += player2;

			if (money1 <= 0 | money2 <= 0) {
				if (money1 <= 0) {
					System.out.println("Player1 패배");
				}
				if (money2 <= 0) {
					System.out.println("Player2 패배");
				}
				break;
			} // 계속해서 진행한 후 돈이 0 이하가 된 플레이어 패배
			

			if (count1 >= 28) {
				count1 -= 28;
			}
			if (count2 >= 28) {
				count2 -= 28;
			}
			// 각 플레이어가 주사위를 한 번씩 던져 나온 숫자만큼 이동
			if (count1 > 0 && count1 < 8) {
				now1 = nav[0][count1];
			}
			if (count2 > 0 && count2 < 8) {
				now2 = nav[0][count2];
			}

			if (count1 > 7 && count1 < 15) {
				now1 = nav[1][count1 - 7];
			}
			if (count2 > 7 && count2 < 15) {
				now2 = nav[1][count2 - 7];
			}

			if (count1 > 15 && count1 < 22) {
				now1 = nav[2][count1 - 14];
			}
			if (count2 > 15 && count2 < 22) {
				now2 = nav[2][count2 - 14];
			}

			if (count1 > 21 && count1 < 29) {
				now1 = nav[3][count1 - 21];
			}
			if (count2 > 21 && count2 < 29) {
				now2 = nav[3][count2 - 21];
			}
			
			// 플레이어가 땅을 살건지 말건지 (해당 위치 포인트가 땅의 가격)
			System.out.println("땅을 사시겠습니까?");
			data = sc.next();
			
			// 땅 사면 소유주 표시, 안사면 지나감
			// 상대방 땅을 밟은 사람은 땅가격*2 지불
			// 돈이 0 이하가 된 플레이어는 패배

//			System.out.println("Player1 포인트 : " + point1 + "  Player2 포인트 : " + point2);
//			System.out.println();

		}

	}

}