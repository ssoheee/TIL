package day02;

public class Variable4 {

	public static void main(String[] args) {
		// Primitive Type
		int a = 10;
		char c = 'a';
		
		// Reference Type 자바에서 문자열은 무조건 레퍼런스 타입 (클래스 형의 변수)
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		if (s4.equals(s3)) {
			System.out.println("case1");
		}
		
		int i1 = 10; // 10진수
		int i2 = 010; // 8진수
		int i3 = 0x10; // 16진수
		
		System.out.println(i1+" " + i2 + " " + i3);

		

	}

}
