package db;

public class App2 {
	
	public static void main(String[] args) {
		
		Biz biz = null;		
		Product product = new Product ("p11", "computer", 1000000);
		biz.register(product);
		
		System.out.println(product);
		
	}

}
