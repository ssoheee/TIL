package day02;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) 
	{
		// 2���� ���ڸ� �޾� ���δ�.
		// a/b ���
		// ��� �� �Ҽ��� 3�ڸ����� ����Ͻÿ�.
		
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
