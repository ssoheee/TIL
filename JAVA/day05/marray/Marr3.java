package marray;

import java.util.Random;

public class Marr3 {

	public static void main(String[] args) {

		// 2���� �迭�� �̿��Ͽ� 5�� �л��� 4���� ������ �����Ͽ� ����Ͻÿ�

		Random r = new Random();
		int ma[][] = new int[5][4];
		int stusum = 0, subsum = 0, totsum = 0;
		double stuavg = 0, subavg = 0, totavg = 0;

		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				ma[i][j] = r.nextInt(100) + 1;
			}
		}

		for (int temp[] : ma) {
			for (int data : temp) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}

		// �л� �� ���
		System.out.println("�л��� ���");
		for (int i = 0; i < ma.length; i++) {
			stusum = 0;
			stuavg = 0;
			for (int j = 0; j < ma[i].length; j++) {
				stusum += ma[i][j];
				stuavg = (double) stusum / (ma[i].length); // 4�� ma.length�� ��ü�ϸ� ���� �̻��ϰ� ���� -> �ֱ׷��� !!!!!!!!!!!!!!
			}
			System.out.println(stuavg);

		}

		// ����
		System.out.println("���� ���");
		for (int j = 0; j < ma[0].length; j++) { // ������ �������� ���� �ٲ�°� �� ����
			subsum = 0;
			subavg = 0;
			for (int i = 0; i < ma.length; i++) {
				subsum += ma[i][j];
				subavg = (double) subsum / (ma.length);
			}
			System.out.println(subavg);
		}

		// ��ü ��� ���

	}

}
