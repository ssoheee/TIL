package bank;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc1 = null, acc2 = null; // 레퍼런스 타입의 초기값은 null
		
		try {
			acc1 = new Account("Kim", "12345", 10000);
			System.out.println(acc1);
			System.out.println(Account.cnt);
			acc2 = new Account("Lee", "12346", 20000);
			System.out.println(acc2);
			System.out.println(Account.cnt);
//			System.out.println(acc1); // 계좌가 생성되어야지만 계좌정보가 찍히도록
//			acc1.deposit(100000);
//			System.out.println(acc1);
//			acc1.withdraw(1000000);
//			System.out.println("종료");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
