package forwhile;

public class ForEx1 {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		// 1���� 10���� ����Ͻÿ�
		// Ȧ���� ����Ͻÿ�		
		/*for(int i=1; i<10; i+=2) // ture, false�� ����Ͽ� ������ ����
		{
			System.out.print(i);
			System.out.println();
		}*/
		
		/* �ι�° ���
		for(int i=1;; i<10; i++)		 
		{
			if(i%2 != 0) {
				System.out.print(i);
			}
		}*/
		
		/*int i=1, j=1;
		for(; i<10 && j<=5; i++, j++) {
			System.out.print(i+" " +j+",");
		}*/
		// System.out.println("Last Value: "+(i+j));
		
		/*for(int i=1, j=10; i<=10; i++, j--)
		{
			System.out.println(i+" "+j);
		}*/
		
		// �� ���� ���� 5�� ����� �͵��� ���� ���Ͻÿ�.
		int sum=0;
		for(int i=1, j=10; i<=10; i++, j--)
		{
			if ((i*j)%5==0) {
				sum += i*j;				
			}
			
		}
		System.out.println(sum);
		System.out.println("End");

	}

}
