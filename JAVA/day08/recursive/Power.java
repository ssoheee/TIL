package recursive;

public class Power {

	public static void main(String[] args) {

		int x = 2;
		int n = 5;
		int result = 0;

		for (int i = 1; i <= n; i++) {
			result += power(x, i);
		}
		System.out.println(result);

	}

	private static int power(int x, int n) {

		if (n == 1) {
			return x;
		} else {
			return x * power(x, n - 1);
		}

	}

}
