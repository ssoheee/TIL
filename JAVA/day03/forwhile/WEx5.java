package forwhile;

public class WEx5 {

	public static void main(String[] args) {
		
//		int i = 1, sum=0;		
//		while(i<=10){
//			if (i==7) {
//				break; // break�� ������ ���� ���ʿ� ��ġ�ؾ���!
//			}
//			if(i%2==0) {
//				i++;
//				continue; //�ؿ� ������ �����Ű�� ���� ���� ��			
//			}
//			sum+=i;
//			i++;
//			System.out.println("Process");			
//		}
//		
//		System.out.println(sum);
		
		// for������ �ٲٱ�
		int sum=0;
		for (int i=1; i<=10; i++) {
			if (i==6) {
				break;
			}
			sum += i;
			System.out.println("Process");	
		}
		System.out.println(sum);
	}
}
