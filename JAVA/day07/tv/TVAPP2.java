package tv;

public class TVAPP2 {

	public static void main(String[] args) {
		
		TV tv = new TV();
		System.out.println(tv.toString());
		TV tv2 = new TV("blue",false,9);
		System.out.println(tv2.toString());
		TV tv3 = new TV("green"); // ������ �͵��� �� ������ �����ؾ���
		System.out.println(tv3.toString());
//		tv3.color = "yellow"; // ���� �ڵ� -> attribute�� private �ٿ������
		tv3.setColor(""); // ���� �����ϰ� ������� set�Լ� ���־���
		System.out.println(tv3.getColor());
	}

}
