package lesson;

import java.util.Arrays;
import java.util.Random;

public class Test03 {

	public static void main(String[] args) {

		int num[] = new int[10];
		Random r = new Random();

		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(89) + 10;
		}

		System.out.println(Arrays.toString(num));

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(num));

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));

	}

}
