package day02;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number..?");
		String data = sc.nextLine(); //�׳� next�� �����̽��� �������� ������
		int intNum = Integer.parseInt(data);
		System.out.println(intNum*100);
		sc.close();
	}

}
