package array1;

import java.util.Arrays;

public class SArr1 {

	public static void main(String[] args) {
		
		int a[] = {3,5,4};
		String s1[] = {"B", "A", "C"};
		String s2[] = new String[3];
		s2[0] = new String ("A");
		s2[1] = new String ("B");
		s2[2] = new String ("C");
		
		String str = "ILOVEYOU";
		char c[] = str.toCharArray();
		for (int i=0; i<str.length(); i++) {
			c[i] = (char) (c[i]+3);
		}
		System.out.println(Arrays.toString(c));
		
		String NewStr = new String(c); // char�� �ٽ� String���� ������
		System.out.println(NewStr);

	}

}
