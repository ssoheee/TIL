package forwhile;

public class ForEx1 {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		// 1부터 10까지 출력하시오
		// 홀수만 출력하시오		
		/*for(int i=1; i<10; i+=2) // ture, false를 사용하여 돌리는 구문
		{
			System.out.print(i);
			System.out.println();
		}*/
		
		/* 두번째 방법
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
		
		// 두 수의 곱이 5의 배수인 것들의 합을 구하시오.
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
