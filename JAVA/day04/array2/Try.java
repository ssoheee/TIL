package array2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		
		// ���� �ڵ�

		int user[] = new int[6];
		int num[] = new int[6];
		int data = 0;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int result = 0;
		long price = 0;

		long prize = r.nextInt(90) + 10;
		prize *= 100000000L;
		// ��÷�� ����

		System.out.println("1-10���� 6���� ��ȣ�� �Է��ϼ���");

		for (int i = 0; i < user.length; i++) {
			data = sc.nextInt();

			if (0 < user[i] && user[i] < 10) {
				user[i] = data;
			}

			// 6�� ���� �Է�

			else {
				i--;
				System.out.println("���� ���� ���ڸ� �Է��ϼ���"); // 10 �̻� ���� �Է½� break ������ �� ó�� (�ٽ� �Է¹޵��� �����ϰ� ����)
				continue;
			}

			for (int j = 0; j < num.length; j++) {
				num[j] = r.nextInt(10) + 1;
				for (int k = 0; k < j; k++) // �ߺ� üũ�� ����
				{
					if (num[j] == num[k]) {
						i--;
						break;
					}
				}
			} // ��÷��ȣ 6�� ����

			int count = 0;
			for (int a = 0; a < user.length; a++) {
				for (int b = 0; b < num.length; b++) {
					if (user[a] == num[b]) {
						count++;
					}
				}
			} // ��ȣ �� �� ���� ����

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
			// ����� ��÷�� Ȯ��

			System.out.println("�� ��ȣ��?");
			System.out.println(Arrays.toString(user));
			System.out.println("��÷ ��ȣ��?");
			System.out.println(Arrays.toString(num));
			System.out.println("�����? " + result + "��");
			System.out.println("�� ��÷����? " + prize + "��");
			System.out.println("�� ��÷����? " + price + "��");
			// ���

			sc.close();

		}

	}
}
