package ws;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String data;
		
		System.out.println("�ҹ��ڸ� �Է��ϼ���");
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
		// �ҹ��� ���� �Է¹޾� ���ڿ��� ���� �� ���
		
		for (int i=0; i<size; i++) {
			upper[i] = (char)(input[i]-32);
		}
		// ���ڿ� �빮�ڷ� �ٲٱ�
		
		for (int i=0; i<size; i++) {
			reverse[i] = upper[size-1-i];
		}
		System.out.println(reverse);
		// ���� �Ųٷ� ���
		
		for (int i=0; i<size; i++) {
			enc[i] = (char) (reverse[i]+5);
		}
		System.out.println(enc);
		// +5 ��ȣȭ �� ���
		
		for (int i=0; i<size; i++) {
			reverse[i] = enc[size-1-i];
			dec[i] = (char) (reverse[i]+27);
		}
		System.out.println(dec);
		// ��ȣȭ �� ó�� ���ڿ��� ���
		
		sc.close();

	}

}
