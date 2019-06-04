package marray;

import java.util.Arrays;
import java.util.Random;

public class MArr5 {

	public static void main(String[] args) {

		int ma[][] = new int[5][5];
		
		Random r = new Random();
		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				ma[i][j] = r.nextInt(100) + 1;
			}
		}
		
		int a= 56;
		
		// 1-10까지의 숫자가 있다.
		// a가 발견되면 끝내기
		
		out:

		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				System.out.print(+ma[i][j] + " ");
				if (ma[i][j]==a) {
					break out;
				}
			}
			System.out.println();
		}
		
	}

}
