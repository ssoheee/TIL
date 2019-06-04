package day01;

public class Variable2 {
	
	public static void main(String[] args) {
		boolean b = true;
		char c = 'a';
		byte by = 10;
		short sh = 10;
		int i = 10;
		int i1 = 120000000;
		int i2 = 120000000;
		long ll = 10;
		by = (byte) (20+10) ;
		sh = (short) (100+i);
		ll = i1+i2; //int끼리 연산 후 넘어가는 값은 짤리게 됨 -> (long)i1 + (long)i2로 바꿔야함
		// long 11 = 2200000000000; 에러 이유는 int가 default이기 때문에 오른쪽 숫자값이 먼저 들어가서 에러뜸
		// long ll = 220000000000000L; 이런식으로 표현하면 에러 안뜨고 잘 나타낼 수 있음
		System.out.println(by);
		
		sh = 12+12; 
		/* 원래 되면 안됨 int+int이기 때문에(디폴트가 int값)
		 * sh=(short)(12+12);이지만 자바에서 자동적으로 처리해줌
		 */
		
		float f=1.0f; // float f=1.0f;라고 써야함
		double d=1.0; //실수는 double이 default, 정수는 int
		
		float ff= 1.0f+1.0f; 
		final int a=10; //상수가 됨
	}

}
