package array1;

import java.util.Arrays;
import java.util.Random;

public class ArryWorkshop {

	public static void main(String[] args) {
		
		// a 배열에  인덱스 각 1~9까지의 난수를 발생하여 입력하시오
		// for문 사용, 중복되지 않게
				
		int a[] = new int[6]; // 배열도 reference type
		Random r = new Random();
		
		for (int i=0; i<a.length; i++) {
			a[i] = (int) r.nextInt(9)+1; // 0-8까지 +1이니까 1-9까지
			
			for (int j=0; j<i; j++) { // 중복 체크용 포문
				if(a[i]==a[j]) {
					i--;
					break;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
