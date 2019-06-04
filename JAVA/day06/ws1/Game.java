package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		// 숫자야구

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
		} // 랜덤 4자리 숫자 받기 (중복x)

		System.out.println("4개의 숫자를 입력하세요");

		for (int i = 0; i < 4; i++) {
			user[i] = Integer.parseInt(sc.next());
		} // 사용자가 4자리 숫자 입력

		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(user));

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (num[i] == user[j]) {
					bnum++;
					if (i == j) {
						bnum--;
						snum++;
					} // 숫자가 맞으면 ball, 자리도 같으면 strike
				}
			}
		}

		if (bnum == 0 && snum == 0) {
			System.out.println("OUT");
		} // 아예 안맞으면 out
		else if (snum == 4) {
			System.out.println("HOME RUN"); // 완전히 일치하게 되면 홈런
		} else {
			System.out.print(bnum + "B " + snum + "S");
		}

		sc.close();
	}

}

