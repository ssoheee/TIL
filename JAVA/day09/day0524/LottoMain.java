package day0524;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		Account acc = new Account();
		Lotto lotto = new Lotto();

		int count = 0;
		
		System.out.println("����� ID�� �Է��ϼ���");
		String name = sc.next();
		User player = new User(name, acc);

		while (true) {

			count++;

//			lotto.times = count; // ����

			System.out.println("� ���� �����ұ��");
			System.out.println("1.�����Ա�");
			System.out.println("2.�ζǱ���");
			System.out.println("3.�ܾ���ȸ");
			System.out.println("4.�����������");

			int n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
				long money = sc.nextInt();
				try {
					acc.deposit(money);
				} catch (Exception e) {
				}
				break;
			case 2:
				System.out.println("�ζ� �� �� ���� �Ͻðھ��?");
				int time = sc.nextInt();
				player.buyLotto(time);
				break;
			case 3:
				System.out.println("���� �ܾ���");
				try {
					System.out.println(acc.getBalance());
				} catch (Exception e) {
				}
				break;
			case 4:
				System.out.println(player);
				break;
			}
			
			System.out.println();

			lotto.makeLotNumber(); // �ζ� Ŭ��������

//			int winnerRate = lotto.play(player.lotNumbers); // �ζ� Ŭ����
//
//			if (winnerRate == 1) {
//				System.out.println("�����մϴ� 1���Դϴ�");
//				player.withdraw(10000000000L); // ���� Ŭ����
//			}
//
//			else if (winnerRate == 2) {
//				System.out.println("�����մϴ� 2���Դϴ�.");
//				player.withdraw(1000000000L);
//			}
//
//			else if (winnerRate == 3) {
//				System.out.println("�����մϴ� 3���Դϴ�.");
//				player.withdraw(100000000L);
//			}

		}

	}

}
