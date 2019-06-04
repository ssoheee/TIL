package array1;

import java.util.Arrays;

public class Arr2 {

	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 1;
		a[1] = 5;
		a[2] = 3;
		
		int b[] = {1,5,3};
		
		// a,b 똑같이 배열 채워넣는 법
		
		int c[] = {6,7,8,9,4};
		
		for(int i=0; i<b.length; i++) {
			c[i]=b[i];		
		}
		
		System.out.println(Arrays.toString(c)); // 배열 출력하는 방법(자바 API)
		
		System.arraycopy(b, 1, c, 3, 2); // 배열 복붙하는 법
		
		System.out.println(Arrays.toString(c));

	}

}
