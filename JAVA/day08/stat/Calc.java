package stat;

public class Calc { 
	
	public static int sum(int a, int b) { // 함수의 기능만 쓰기 위한 클래스
		return (a+b);
	}
	
	public static int sum(int a[]) {
		int sum=0;
		for (int data:a) {
			sum += data;
		}
		
		return sum;
	}

}
