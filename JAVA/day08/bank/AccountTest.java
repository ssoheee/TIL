package bank;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc1 = null, acc2 = null; // ���۷��� Ÿ���� �ʱⰪ�� null
		
		try {
			acc1 = new Account("Kim", "12345", 10000);
			System.out.println(acc1);
			System.out.println(Account.cnt);
			acc2 = new Account("Lee", "12346", 20000);
			System.out.println(acc2);
			System.out.println(Account.cnt);
//			System.out.println(acc1); // ���°� �����Ǿ������ ���������� ��������
//			acc1.deposit(100000);
//			System.out.println(acc1);
//			acc1.withdraw(1000000);
//			System.out.println("����");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
