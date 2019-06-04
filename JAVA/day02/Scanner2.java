package day02;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) 
	{
		// 2개의 숫자를 받아 들인다.
		// a/b 계산
		// 출력 시 소숫점 3자리까지 출력하시오.
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("a = ");
		String input1 = sc1.nextLine();
		int a = Integer.parseInt(input1);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("b = ");
		String input2 = sc2.nextLine();
		int b = Integer.parseInt(input2);
		
		double c = (double) a / (double) b;
		
		System.out.println(c);
		System.out.printf("a/b = %10.3f", c);
		
		sc1.close();
		sc2.close();

	}

}
