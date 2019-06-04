package ws2;

public class MobileTest {

	public static void main(String[] args) {

		// 각각의 Mobile 객체 생성
		Mobile m[] = new Mobile[2];
		m[0] = new Ltab("Ltab", 500, "AP-01");
		m[1] = new Otab("Otab", 1000, "AND-20");

		// 생성된 객체의 정보 출력
		for (Mobile data : m) {
			System.out.println(data.toString());
		}

		// 각각의 Mobile 객체에 10분씩 충전 -> charge
		for (Mobile data : m) {
			data.charge(10);
		}

		// 10분 충전 후 객체 정보 출력
		for (Mobile data : m) {
			System.out.println(data.toString());
		}

		// 각각의 Mobile 객체에 5분씩 통화 -> operate
		for (Mobile data : m) {
			data.operate(5);
		}

		// 5분 통화 후 객체 정보 출력
		for (Mobile data : m) {
			System.out.println(data.toString());
		}

	}

}
