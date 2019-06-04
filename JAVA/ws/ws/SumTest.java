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
			for (int j = 0; j < i; j++) { // �ߺ� üũ�� ����
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		} // �ߺ���� ���� 100�� ������ �迭�� 1-100 ���� ���� �߻�

		System.out.println(Arrays.toString(num));

		for (int i = 0; i < 50; i++) {
			odd[i] = num[2 * i]; // Ȧ�� ��°�� �ִ� �����鸸 50�� �迭�� ����
			even[i] = num[2 * i + 1]; // ¦�� ��°�� �ִ� �����鸸 50�� �迭�� ����
		}
			
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));

		for (int i = 0; i < 50; i++) 
		{
			sum[i] = even[i] + odd[49 - i];
		} // Ȧ�� �� + ¦�� ù �� ����ϰ� �����ؼ� �迭�� �ٽ� ����

		System.out.println(Arrays.toString(sum));

	}
}