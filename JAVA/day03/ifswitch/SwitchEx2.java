package ifswitch;

public class SwitchEx2 {

	public static void main(String[] args) {
		int month = 1;
		int LastDayOfMonth = 0;
		
		// 해당 월의 마지막 일자 출력
		
		switch(month){
		case 1 : 
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			LastDayOfMonth = 31;
		break;
		
		case 2 : LastDayOfMonth = 28;
		break;
		
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			LastDayOfMonth = 30;
		break;

		}
			
		System.out.println(LastDayOfMonth);

	}

}
