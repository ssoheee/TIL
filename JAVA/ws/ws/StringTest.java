package ws;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String data;
		
		System.out.println("소문자를 입력하세요");
		data = sc.next();
		int size = data.length();
		char[] input=new char[size];
		char[] upper=new char[size];
		char[] reverse=new char[size];
		char[] enc=new char[size];
		char[] dec=new char[size];
		
		for (int i=0; i<size; i++) {
			input[i] = data.charAt(i);		
		} 
		System.out.println(input);
		// 소문자 문자 입력받아 문자열로 생성 후 출력
		
		for (int i=0; i<size; i++) {
			upper[i] = (char)(input[i]-32);
		}
		// 문자열 대문자로 바꾸기
		
		for (int i=0; i<size; i++) {
			reverse[i] = upper[size-1-i];
		}
		System.out.println(reverse);
		// 순서 거꾸로 출력
		
		for (int i=0; i<size; i++) {
			enc[i] = (char) (reverse[i]+5);
		}
		System.out.println(enc);
		// +5 암호화 후 출력
		
		for (int i=0; i<size; i++) {
			reverse[i] = enc[size-1-i];
			dec[i] = (char) (reverse[i]+27);
		}
		System.out.println(dec);
		// 복호화 후 처음 문자열로 출력
		
		sc.close();

	}

}
