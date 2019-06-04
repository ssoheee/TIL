package recursive;

public class Cub {

	public static void main(String[] args) {

		int x = 2;
		int n = 6;
		int result = cub(x, n);
		System.out.println(result);
	}

	private static int cub(int x, int n) {

		if (n == 1)
			return x;
		else
			return x * cub(x, n - 1);
	}

}
