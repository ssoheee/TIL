package array1;

import java.util.Arrays;
import java.util.Random;

public class ArryWorkshop {

	public static void main(String[] args) {
		
		// a �迭��  �ε��� �� 1~9������ ������ �߻��Ͽ� �Է��Ͻÿ�
		// for�� ���, �ߺ����� �ʰ�
				
		int a[] = new int[6]; // �迭�� reference type
		Random r = new Random();
		
		for (int i=0; i<a.length; i++) {
			a[i] = (int) r.nextInt(9)+1; // 0-8���� +1�̴ϱ� 1-9����
			
			for (int j=0; j<i; j++) { // �ߺ� üũ�� ����
				if(a[i]==a[j]) {
					i--;
					break;
				}
				
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
