package day02;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number..?");
		String data = sc.nextLine(); //그냥 next는 스페이스를 기준으로 가져옴
		int intNum = Integer.parseInt(data);
		System.out.println(intNum*100);
		sc.close();
	}

}
