package ifswitch;

public class SwitchEx1 {

	public static void main(String[] args) {
		// Admin Permission Control
		
		int a=1; 
		String str = "";
		switch(a) // a���� int, string, char�� �� �� ����! long, double, float �� �ȵ�
		{
		case 1: str += "Super Admin"; //case �ڸ��� ���� �� �� ����
		case 2: str += "Middle Admin";
		case 3: str += "Admin";
		break;
		default: str="FAIL";
		break;
		}
		System.out.println(str);

	}

}
