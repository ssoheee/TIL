package forwhile;

public class WEx5 {

	public static void main(String[] args) {
		
//		int i = 1, sum=0;		
//		while(i<=10){
//			if (i==7) {
//				break; // break는 무조건 블럭의 앞쪽에 위치해야함!
//			}
//			if(i%2==0) {
//				i++;
//				continue; //밑에 구문을 실행시키고 싶지 않을 때			
//			}
//			sum+=i;
//			i++;
//			System.out.println("Process");			
//		}
//		
//		System.out.println(sum);
		
		// for문으로 바꾸기
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
