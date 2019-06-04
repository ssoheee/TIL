package ws;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 0;

		// input	
		while (true) {
			System.out.println("사이즈를 입력하세요");
			size = sc.nextInt();

			if (size >= 4 && size < 10) {
				break;
			} else
				continue;
		} // 사이즈 범위 벗어나면 다시 입력받도록

		int[][] map = new int[size][size];
		boolean[] check = new boolean[101]; // 숫자 범위가 1-100이니까

		// map에 랜덤변수 넣기
		Random r = new Random();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				while (true) {
					int temp = r.nextInt(100) + 1;
					// 시간줄이기용 중복체크
					if (check[temp]) {
						continue;
					} else {
						check[temp] = true;
						map[j][i] = temp;
						break;
					}
				}
			}
		}

		int bingo = 3; // 3빙고로 게임 설정

		System.out.println("얼마를 넣으시겠습니다"); // 몇번 게임 실행할지
		int playerCount = sc.nextInt();
		System.out.println(playerCount + "만원 받았습니다");

		// play 시작 -> while 사용해서 계속 반복되도록!
		while (true) {
			System.out.println(playerCount + "만원 남았습니다");

			if (playerCount == 0) {
				log(size, map);
				System.out.println("돈이 없습니다 계속하시겠습니까?");
				break;
			}

			System.out.println("숫자를 입력하세요");
			int number = sc.nextInt();
			int bingoNumber = 0;
			int count = 0;

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (map[j][i] == number) {
						map[j][i] = 0; 
						count++; // 입력한 숫자가 배열에 있으면 0으로 만들어주고, 게임실행횟수 카운트
					}
				}
			}

			if (count == 0) {
				System.out.println("꽝"); // 입력한 숫자가 없을 때
			}

			
			// 빙고 체크

			// 대각선 두개 체크
			int c = 0;
			for (int i = 0; i < size; i++) {
				if (map[i][i] == 0) {
					c++;
				}
			}
			if (c == size) { // 대각선 갯수가 입력한 사이즈 수와 같으므로 비교해보고, 같으면 빙고넘버+1
				bingoNumber++;
			}

			c = 0;
			for (int i = size - 1; i >= 0; i--) {
				if (map[i][size - 1 - i] == 0) {
					c++;
				}
			}
			if (c == size) {
				bingoNumber++;
			}

			// 가로줄 체크
			for (int i = 0; i < size; i++) {
				int d = 0;
				for (int j = 0; j < size; j++) {
					if (map[j][i] == 0) {
						d++;
					}
				}
				if (d == size) {
					bingoNumber++;
				}
			}

			// 세로줄 체크
			for (int i = 0; i < size; i++) { // 가로와는 i,j 위치의 차이
				int d = 0;
				for (int j = 0; j < size; j++) {

					if (map[i][j] == 0) {
						d++;
					}
				}
				if (d == size) {
					bingoNumber++;
				}
			}

			// 빙고 됐으면 말해주기
			if (bingoNumber == 1) {
				System.out.println("원빙고입니다.");
			} else if (bingoNumber == 2) {
				System.out.println("투빙고");
			}

			// 원하는 빙고 되면 끝내기
			if (bingoNumber == bingo) {
				log(size, map);
				System.out.println("게임끝");
				System.out.println("상금" + (size * size) + "만원입니다 축하합니다.");
				break;
			}
			playerCount--; // 게임이 한번씩 실행될 때마다 카운트
		}
		sc.close();
	}
	
	public static void log(int size, int[][] map) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(map[j][i] + " ");
			}
			System.out.println();
		}
	}
}