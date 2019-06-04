package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr3 {

	public static void main(String[] args) {

		int a[] = new int[30];
		Random r = new Random();
		int sum = 0;
		double average = 0;

		// 10-99까지의 숫자를 랜덤하게 배열에 입력
		// 합과 평균을 구하시오
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(90) + 10;
			sum += a[i];
		}
		average = (double) sum / (double) a.length;
		System.out.println(Arrays.toString(a));
		System.out.println("--------------------");
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("--------------------");

		// 최대값과 최소값을 출력하시오
		int max = a[0], min = a[0]; // 초기화 값 중요! -> 기준점이 있어야된다
		for (int j = 0; j < a.length; j++) {
			if (a[j] > max) {
				max = a[j];
			} else if (a[j] < min) {
				min = a[j];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("--------------------");

		// 작은 수부터 정렬하시오 -----------> 어떻게 진행되는건지 잘 살펴보기!
		for (int k = 0; k < a.length; k++) {
			for (int l = 0; l < a.length - 1 - k; l++) { // 처음 값과 비교하며 몇 번 비교를 실행할지
				if (a[l] > a[l + 1]) {
					int temp = a[l];
					a[l] = a[l + 1];
					a[l + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

		// 큰 수부터 정렬하시오
		for (int k = 0; k < a.length; k++) {
			for (int l = 0; l < a.length - 1 - k; l++) { // 처음 값과 비교하며 몇 번 비교를 실행할지
				if (a[l] < a[l + 1]) {
					int temp = a[l];
					a[l] = a[l + 1];
					a[l + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("--------------------");
		
		// 배열에 있는 숫자들의 갯수를 구하시오
		int count[] = new int[100]; // 숫자의 범위 때문에
		for (int i=0; i<a.length; i++) {
			count[a[i]]++;
		}
		for (int i=0; i<count.length;i++) {
			System.out.println(i+": "+count[i]);
		}

	}
}
