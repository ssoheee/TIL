package ifswitch;

public class Game2 {

	public static void main(String[] args) {
		
		String str = "thgml519@naver.com";
		
		// int c = str.indexOf("@");
		
		String id = str.substring(0, str.indexOf("@"));
		String domain = str.substring(str.indexOf("@")+1, str.indexOf("."));
		
		System.out.println(id);
		System.out.println(domain);


	}

}
