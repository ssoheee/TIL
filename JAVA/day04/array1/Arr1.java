package array1;

import java.util.Random;

public class Arr1 {

	public static void main(String[] args) {
		

		int a[] = new int[6]; // �迭�� reference type
		Random r = new Random();
		
		a[0] = 10;
		a[1] = 30;
		a[2] = 20;		
		
		System.out.println(a); // a���� ���۷��� ��(�ּ�) ����
		System.out.println(a.length); //�迭 ����
		
		for(int ind=0; ind<a.length; ind++) {
			System.out.println(a[ind]);
		}
		
		for (int temp:a) {
			System.out.println(temp); 
			// enhanced for statement -> ��� ���ȴ����� �� �� ����.
			// for declaration:expression) -> expression�� �迭 �Ǵ� �迭�� �����ϴ� �Լ�
		}
		
			

	}

}
