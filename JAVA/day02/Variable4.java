package day02;

public class Variable4 {

	public static void main(String[] args) {
		// Primitive Type
		int a = 10;
		char c = 'a';
		
		// Reference Type �ڹٿ��� ���ڿ��� ������ ���۷��� Ÿ�� (Ŭ���� ���� ����)
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		if (s4.equals(s3)) {
			System.out.println("case1");
		}
		
		int i1 = 10; // 10����
		int i2 = 010; // 8����
		int i3 = 0x10; // 16����
		
		System.out.println(i1+" " + i2 + " " + i3);

		

	}

}
