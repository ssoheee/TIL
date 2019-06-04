package ws;

import java.util.Arrays;
import java.util.Random;

public class SumTest {

	public static void main(String[] args) {

		int num[] = new int[100];
		int odd[] = new int[50];
		int even[] = new int[50];
		int sum[] = new int[50];

		Random r = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100) + 1;
			for (int j = 0; j < i; j++) { // 중복 체크용 포문
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		} // 중복허용 없이 100개 정수형 배열에 1-100 숫자 난수 발생

		System.out.println(Arrays.toString(num));

		for (int i = 0; i < 50; i++) {
			odd[i] = num[2 * i]; // 홀수 번째에 있는 정수들만 50개 배열에 저장
			even[i] = num[2 * i + 1]; // 짝수 번째에 있는 정수들만 50개 배열에 저장
		}
			
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));

		for (int i = 0; i < 50; i++) 
		{
			sum[i] = even[i] + odd[49 - i];
		} // 홀수 끝 + 짝수 첫 쭉 계산하고 저장해서 배열로 다시 저장

		System.out.println(Arrays.toString(sum));

	}
}