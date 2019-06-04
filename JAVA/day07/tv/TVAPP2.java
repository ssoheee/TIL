package tv;

public class TVAPP2 {

	public static void main(String[] args) {
		
		TV tv = new TV();
		System.out.println(tv.toString());
		TV tv2 = new TV("blue",false,9);
		System.out.println(tv2.toString());
		TV tv3 = new TV("green"); // 생성된 것들은 그 성질을 유지해야함
		System.out.println(tv3.toString());
//		tv3.color = "yellow"; // 오류 코드 -> attribute에 private 붙여줘야함
		tv3.setColor(""); // 값을 강력하게 만드려면 set함수 없애야함
		System.out.println(tv3.getColor());
	}

}
