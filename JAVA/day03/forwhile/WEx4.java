package forwhile;

public class WEx4 {

	public static void main(String[] args) {
		
//		int sum=0;
//		int i=0;	
//		while((sum += ++i) <= 100) {
//			System.out.println(i+" " +sum);			
//		}
//		
		// for문으로 변경
		for(int i=1, sum=1; sum<100; sum+=++i) {
			System.out.println(i+" " +sum); //초기값 다른 것 주의
		}

	}

}
