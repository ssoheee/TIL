package forwhile;

public class WEx {

	public static void main(String[] args) {
		// for
		for (int i = 1; i <= 10; i++) {
			// System.out.println(i);
		}

		// while
		int i = 1; // 밖에서 선언 중요!
		while (i <= 10) {
			// System.out.println(i);
			i++;
		}

		// 2중 for문
		for (int a = 0; a < 10; a++) {
			for (int b = 10; b >= 0; b--) {
				System.out.println(a + " " + b);
			}
		}

		System.out.println();

		// while로 변경
		int c = 0;
		while (c <= 10) {
			int d = 10; //d를 여기서 선언하는것이 중요
			while (d >= 0) {
				System.out.println(c + " " + d);
				d--;
			}
			c++; //어디서 증감시킬지 위치 중요
		}

	}

}
