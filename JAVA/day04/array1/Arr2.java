package array1;

import java.util.Arrays;

public class Arr2 {

	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 1;
		a[1] = 5;
		a[2] = 3;
		
		int b[] = {1,5,3};
		
		// a,b �Ȱ��� �迭 ä���ִ� ��
		
		int c[] = {6,7,8,9,4};
		
		for(int i=0; i<b.length; i++) {
			c[i]=b[i];		
		}
		
		System.out.println(Arrays.toString(c)); // �迭 ����ϴ� ���(�ڹ� API)
		
		System.arraycopy(b, 1, c, 3, 2); // �迭 �����ϴ� ��
		
		System.out.println(Arrays.toString(c));

	}

}
