package marray;

import java.util.Arrays;
import java.util.Random;

public class MArr1 {

	public static void main(String[] args) {

		int a[] = new int[5];
		int ma[][] = new int[2][3];

		Random r = new Random();

		// ma.length = 첫번째 길이값
		// m[0].length = 두번째 길이값

		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				ma[i][j] = r.nextInt(10) + 1;
			}
		}

		System.out.println(Arrays.deepToString(ma));
		System.out.println();

		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				System.out.println(ma[i][j] + " ");
			}
			System.out.println();
		}

		// -> Enhanced for Statement로 출력하기
		for (int temp[] : ma) {
			for (int data : temp) {
				System.out.print(data + " ");
			}
			System.out.println();
		}

	}

}
