package ws;

import java.util.Arrays;
import java.util.Random;

public class Vote {

	public static void main(String[] args) {
		
		int num[] = new int [50];
		int count[] = new int[6];
		int temp=0;
		int minresult=0, maxresult=0;
		
		Random r = new Random();
		
		for (int i=0; i<num.length; i++) {
			num[i] = r.nextInt(5)+1;
		}
		
		System.out.println(Arrays.toString(num));
		
		
		for (int i=0; i<num.length; i++) {
			count[num[i]]++;
		}
		
		for (int i=1; i<count.length;i++) {
			System.out.println(i+"�� �ĺ�: "+count[i]+"ǥ");
		}
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE; // ��ǻ�Ϳ��� ���� ū���� ���� �������� �ʱ�ȭ
		
		for (int i=1; i<count.length; i++) {
			
			if (max<count[i]) {
				max=count[i];
				maxresult=i;
			}
			
			 if (count[i] < min) {
				min = count[i];
				minresult=i;
			}
			 
		}
		
		System.out.println();
		System.out.println("���� ���� ���� �ĺ� : " + maxresult + "��");
		System.out.println("���� ���� ���� �ĺ� : " + minresult + "��");
		System.out.println();
		
		for (int i= 0; i < count.length; i++) {
			for (int j = 0; j < count.length - 1 - i; j++) { 
				if (count[j]<count[j+1]) {
					temp = count[j];
					count[j] = count[j+1];
					count[j+1] = temp;
				}
			}
		}
		System.out.println("��ǥ ���� ���� �� ���� : "+Arrays.toString(count));

		
		for (int i= 0; i < count.length; i++) {
			for (int j = 0; j < count.length - 1 - i; j++) { 
				if (count[j]>count[j+1]) {
					temp = count[j];
					count[j] = count[j+1];
					count[j+1] = temp;
				}
			}
		}
		System.out.println("��ǥ ���� ���� �� ���� : "+Arrays.toString(count));

	}

}
