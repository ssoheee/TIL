package forwhile;

public class WEx {

	public static void main(String[] args) {
		// for
		for (int i = 1; i <= 10; i++) {
			// System.out.println(i);
		}

		// while
		int i = 1; // �ۿ��� ���� �߿�!
		while (i <= 10) {
			// System.out.println(i);
			i++;
		}

		// 2�� for��
		for (int a = 0; a < 10; a++) {
			for (int b = 10; b >= 0; b--) {
				System.out.println(a + " " + b);
			}
		}

		System.out.println();

		// while�� ����
		int c = 0;
		while (c <= 10) {
			int d = 10; //d�� ���⼭ �����ϴ°��� �߿�
			while (d >= 0) {
				System.out.println(c + " " + d);
				d--;
			}
			c++; //��� ������ų�� ��ġ �߿�
		}

	}

}
