package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr3 {

	public static void main(String[] args) {

		int a[] = new int[30];
		Random r = new Random();
		int sum = 0;
		double average = 0;

		// 10-99������ ���ڸ� �����ϰ� �迭�� �Է�
		// �հ� ����� ���Ͻÿ�
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

		// �ִ밪�� �ּҰ��� ����Ͻÿ�
		int max = a[0], min = a[0]; // �ʱ�ȭ �� �߿�! -> �������� �־�ߵȴ�
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

		// ���� ������ �����Ͻÿ� -----------> ��� ����Ǵ°��� �� ���캸��!
		for (int k = 0; k < a.length; k++) {
			for (int l = 0; l < a.length - 1 - k; l++) { // ó�� ���� ���ϸ� �� �� �񱳸� ��������
				if (a[l] > a[l + 1]) {
					int temp = a[l];
					a[l] = a[l + 1];
					a[l + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

		// ū ������ �����Ͻÿ�
		for (int k = 0; k < a.length; k++) {
			for (int l = 0; l < a.length - 1 - k; l++) { // ó�� ���� ���ϸ� �� �� �񱳸� ��������
				if (a[l] < a[l + 1]) {
					int temp = a[l];
					a[l] = a[l + 1];
					a[l + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("--------------------");
		
		// �迭�� �ִ� ���ڵ��� ������ ���Ͻÿ�
		int count[] = new int[100]; // ������ ���� ������
		for (int i=0; i<a.length; i++) {
			count[a[i]]++;
		}
		for (int i=0; i<count.length;i++) {
			System.out.println(i+": "+count[i]);
		}

	}
}
