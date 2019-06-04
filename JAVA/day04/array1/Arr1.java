package array1;

import java.util.Random;

public class Arr1 {

	public static void main(String[] args) {
		

		int a[] = new int[6]; // 배열도 reference type
		Random r = new Random();
		
		a[0] = 10;
		a[1] = 30;
		a[2] = 20;		
		
		System.out.println(a); // a에선 레퍼런스 값(주소) 나옴
		System.out.println(a.length); //배열 길이
		
		for(int ind=0; ind<a.length; ind++) {
			System.out.println(a[ind]);
		}
		
		for (int temp:a) {
			System.out.println(temp); 
			// enhanced for statement -> 몇번 돌렸는지는 알 수 없다.
			// for declaration:expression) -> expression은 배열 또는 배열을 리턴하는 함수
		}
		
			

	}

}
