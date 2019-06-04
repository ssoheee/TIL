package ifswitch;

public class IfEx2 {

	public static void main(String[] args) {
		
		// else if 와 else의 차이점! 그리고 if-else if 사용후엔 else를 사용해서 꼭 막아주기
		
		int a = 68;
		char c = ' ';
		
		if(90<=a) {
			c = 'A';
		}
		else if(80<=a) {
			c = 'B';
		}
		else if(70<=a) {
			c = 'C';
		}
		else {
			c = 'F';
		}
		
		System.out.println(c);
	}

}
