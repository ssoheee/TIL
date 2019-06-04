package ws2;

public class MobileTest {

	public static void main(String[] args) {

		// ������ Mobile ��ü ����
		Mobile m[] = new Mobile[2];
		m[0] = new Ltab("Ltab", 500, "AP-01");
		m[1] = new Otab("Otab", 1000, "AND-20");

		// ������ ��ü�� ���� ���
		for (Mobile data : m) {
			System.out.println(data.toString());
		}

		// ������ Mobile ��ü�� 10�о� ���� -> charge
		for (Mobile data : m) {
			data.charge(10);
		}

		// 10�� ���� �� ��ü ���� ���
		for (Mobile data : m) {
			System.out.println(data.toString());
		}

		// ������ Mobile ��ü�� 5�о� ��ȭ -> operate
		for (Mobile data : m) {
			data.operate(5);
		}

		// 5�� ��ȭ �� ��ü ���� ���
		for (Mobile data : m) {
			System.out.println(data.toString());
		}

	}

}
