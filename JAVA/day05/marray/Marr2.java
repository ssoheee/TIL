package marray;

import java.util.Random;

public class Marr2 {

	public static void main(String[] args) {

		Random r = new Random();
		
//		int ma[][] = {
//				{2,4,3,5},
//				{8,4,3,5,3,5,6,4},
//				{1,4,3,5},
//				{6,4,3,5,7,4,2}
//		};

		int ma[][] = new int[3][];
		ma[0] = new int[5]; // 배열을 넣을 수 있음
		ma[1] = new int[2];
		ma[2] = new int[3]; // 3행4열의 배열
		// int ma[][] = new int [3][4]

		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				ma[i][j] = r.nextInt(10) + 1;
			}
		}

		for (int temp[] : ma) {
			for (int data : temp) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
		

	}

}
