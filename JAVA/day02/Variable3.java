package day02;

import java.util.Scanner;

public class Variable3 {

	public static void main(String[] args) {
		// 4������ ������ ������ �Է� �޴´�.
		// �հ�� ����� ���Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("�� ���� ������ �Է��Ͻÿ�");
		
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
		avg = sum/4; // ū���� �������� ĳ������ �Ǳ� ������ Ÿ���� �� �ʿ� ����
		
		System.out.printf("Sum = %f \n", sum);
		System.out.printf("Average = %10.3f \n", avg);
		
		sc.close();

	}

}
