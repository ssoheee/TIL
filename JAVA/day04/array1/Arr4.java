package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr4 {

	public static void main(String[] args) {
		
		// 1-4까지의 숫자를 랜덤하게 배열에 입력
		// 투표 결과를 count 배열에 합산하시오
		int a[] = new int[100];
		Random r = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(4) + 1;

		}
		System.out.println(Arrays.toString(a));
		
		int count[] = new int[5]; // 숫자의 범위 때문에
		for (int i=0; i<a.length; i++) {
			count[a[i]]++;
		}
		for (int i=1; i<count.length;i++) {
			System.out.println(i+" : "+count[i]);
		}

	}
}
