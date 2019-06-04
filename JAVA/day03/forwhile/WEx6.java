package forwhile;

public class WEx6 {

	public static void main(String[] args) {

		// 구구단을 출력하시오
		// 홀수 단만 출력하시오
		// 결과가 49일 때 멈추세요

//		int result =0;
//		for (int i=2; i<=9; i++) {
//			
//			if (i%2==0) {
//				continue;
//			} // 이 부분 중요! 이해해야해
//			
//			for (int j=1; j<10; j++) {
//				if (result==49)
//				{
//					break;
//				}
//				result = i*j;	
//				System.out.println(i+"*"+j+"= "+result);				
//			}
//			System.out.println();
//		}

		out: 
			for (int i = 2; i <= 9; i++) {

			if (i % 2 == 0) {
				continue;
			}
			int result = 0;
			for (int j = 1; j < 10; j++) {
				if (result == 49) {
					break out; // out 위치로 나가게됨 (while 앞에 붙이면 while 밖으로 나감)
				}
				result = i * j;
				System.out.println(i + "*" + j + "= " + result);
			}
			System.out.println();
		}

	}

}
