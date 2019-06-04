package ws2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 9;
		char candy[][] = new char[size][size]; // 9x9 캔디판 생성
		int from[] = new int[2];
		int to[] = new int[2];
		int x1 = 0, y1 = 0;
		int x2 = 0, y2 = 0;
		int cal1 = 0, cal2 = 0;
		char temp = 0;
		int count = 0;

		System.out.println("생성된 캔디판");

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				candy[i][j] = (char) ((int) (Math.random() * 5) + 65);
				System.out.print(candy[i][j] + " ");
			}
			System.out.println();
		} // 캔디판에 ABCDE를 랜덤으로 캔디판에 넣는다

		while (true) {
			System.out.println("바꾸고 싶은 알파벳 좌표값 입력");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			// 사용자가 판을 보고 바꾸고 싶어하는 알파벳의 좌표를 선택
			System.out.println("어디 위치로 옮기고 싶은지 입력");
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			// 그 알파벳의 이웃 알바펫 좌표 어디로 자리를 바꿀지 입력

			cal1 = Math.abs(x1 - x2);
			cal2 = Math.abs(y1 - y2);
			if ((cal1 == 0 | cal1 == 1) && (cal2 == 0 | cal2 == 1)) {
				break;
			} else {
				System.out.println("Error");
				continue;
			}

		} // 단, 이웃한 문자만 바꿀 수 있음, 이외 경우에는 에러 메세지 출력

		temp = candy[x1][y1];
		candy[x1][y1] = candy[x2][y2];
		candy[x2][y2] = temp;

		System.out.println("바뀐 배열");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(candy[i][j] + " ");
			}
			System.out.println();
		} // 자리 바꿔서 출력

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 2; j++) {
				if (candy[i][j] == candy[i][j + 1] && candy[i][j] == candy[i][j + 2]) {
					count++;
				}
			}
		}

		System.out.println(count + "개 성공!"); // 3개의 문자가 이웃되면 없어지고 점수 카운트 추가 후 종료

	}

}
