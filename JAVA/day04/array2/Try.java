package array2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		
		// 망한 코드

		int user[] = new int[6];
		int num[] = new int[6];
		int data = 0;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int result = 0;
		long price = 0;

		long prize = r.nextInt(90) + 10;
		prize *= 100000000L;
		// 당첨금 생성

		System.out.println("1-10까지 6개의 번호를 입력하세요");

		for (int i = 0; i < user.length; i++) {
			data = sc.nextInt();

			if (0 < user[i] && user[i] < 10) {
				user[i] = data;
			}

			// 6개 숫자 입력

			else {
				i--;
				System.out.println("범위 내의 숫자를 입력하세요"); // 10 이상 숫자 입력시 break 때문에 꽝 처리 (다시 입력받도록 수정하고 싶음)
				continue;
			}

			for (int j = 0; j < num.length; j++) {
				num[j] = r.nextInt(10) + 1;
				for (int k = 0; k < j; k++) // 중복 체크용 포문
				{
					if (num[j] == num[k]) {
						i--;
						break;
					}
				}
			} // 당첨번호 6개 생성

			int count = 0;
			for (int a = 0; a < user.length; a++) {
				for (int b = 0; b < num.length; b++) {
					if (user[a] == num[b]) {
						count++;
					}
				}
			} // 번호 비교 후 맞은 갯수

			if (count < 3) {
				result = 0;
				price = 0;
			} else if (count == 3) {
				result = 4;
				price = (long) (prize * 0.05);
			} else if (count == 4) {
				result = 3;
				price = (long) (prize * 0.1);
			} else if (count == 5) {
				result = 2;
				price = (long) (prize * 0.2);
			} else if (count == 6) {
				result = 1;
				price = (long) (prize * 0.5);
			}
			// 등수와 당첨금 확정

			System.out.println("내 번호는?");
			System.out.println(Arrays.toString(user));
			System.out.println("당첨 번호는?");
			System.out.println(Arrays.toString(num));
			System.out.println("등수는? " + result + "등");
			System.out.println("총 당첨금은? " + prize + "원");
			System.out.println("내 당첨금은? " + price + "원");
			// 출력

			sc.close();

		}

	}
}
