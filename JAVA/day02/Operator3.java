package day02;

import java.util.Scanner;

public class Operator3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		char c = data.charAt(0); // 라이브러리 이용
		
		if(('a'<=c && c<='z')|| ('A'<=c && c<='Z')) {
			System.out.println("문자");
			sc.close(); // 반드시 리턴 전에 클로즈
			return;
		}
		else {
			System.out.println("숫자");
		}
		c++;
		System.out.println(c);
		sc.close();

	}

}
