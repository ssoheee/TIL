package forwhile;

public class WEx4 {

	public static void main(String[] args) {
		
//		int sum=0;
//		int i=0;	
//		while((sum += ++i) <= 100) {
//			System.out.println(i+" " +sum);			
//		}
//		
		// for������ ����
		for(int i=1, sum=1; sum<100; sum+=++i) {
			System.out.println(i+" " +sum); //�ʱⰪ �ٸ� �� ����
		}

	}

}
