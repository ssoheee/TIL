package day02;

public class Operator2 {

	public static void main(String[] args) {
		double d = 3.14356523;
		
		// 소숫점 3자리 이하 버림을 계산하고 출력
		
		double shortd1 = (int) (d*1000)/1000.0; // Math.floor(d*1000)/1000.0 이용
		System.out.println(shortd1);
		
		// 소숫점 3자리 이하 반올림을 계산하고 출력
		
		double shortd2 = (int) (d*1000+0.5)/1000.0; // Math.round(d*1000)/1000.0 이용
		System.out.println(shortd2);
		
		// 직각 삼각형 가로세로가 5, 4인 삼각형의 빗변의 길이를 구하시오
		
		int a=5, b=4;
		double c=0;
		c= Math.sqrt(a*a+b*b); // c=Math.sqrt(Math.pow(5,2)+Math.pow(4,2));
		System.out.println(c);

	}

}
