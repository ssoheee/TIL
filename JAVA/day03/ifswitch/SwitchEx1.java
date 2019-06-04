package ifswitch;

public class SwitchEx1 {

	public static void main(String[] args) {
		// Admin Permission Control
		
		int a=1; 
		String str = "";
		switch(a) // a값에 int, string, char만 들어갈 수 있음! long, double, float 등 안됨
		{
		case 1: str += "Super Admin"; //case 자리에 조건 쓸 수 없음
		case 2: str += "Middle Admin";
		case 3: str += "Admin";
		break;
		default: str="FAIL";
		break;
		}
		System.out.println(str);

	}

}
