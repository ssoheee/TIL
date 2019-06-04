package inter;

public class View {

	public static void main(String[] args) {

		Shop shop = new Auction(); // 이것만 바꾸면 마음대로 화면에 디스플레이 가능
		shop.register();
		shop.login();
		shop.order();
		shop.logout();

	}

}
