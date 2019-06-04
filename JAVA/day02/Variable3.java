package day02;

import java.util.Scanner;

public class Variable3 {

	public static void main(String[] args) {
		// 4과목의 점수를 정수로 입력 받는다.
		// 합계와 평균을 구하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("네 과목 성적을 입력하시오");
		
		String num1 = sc.next();
		String num2 = sc.next();
		String num3 = sc.next();
		String num4 = sc.next();
		
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int c = Integer.parseInt(num3);
		int d = Integer.parseInt(num4);
		
		double sum = 0;
		double avg = 0;
		
		sum = a+b+c+d;
		avg = sum/4; // 큰숫자 기준으로 캐스팅이 되기 때문에 타이핑 할 필요 없음
		
		System.out.printf("Sum = %f \n", sum);
		System.out.printf("Average = %10.3f \n", avg);
		
		sc.close();

	}

}
