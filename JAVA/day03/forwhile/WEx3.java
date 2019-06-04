package forwhile;

public class WEx3 {

	public static void main(String[] args) throws InterruptedException {
//		int i = 0;
//		while (i++ < 10) {
//			System.out.println(i); // 1ºÎÅÍ ÂïÈ÷°ÔµÊ
//		}

		int j = 5;
		while (j-- != 0) {
			Thread.sleep(1000);
			System.out.println(j);
		}

	}

}
