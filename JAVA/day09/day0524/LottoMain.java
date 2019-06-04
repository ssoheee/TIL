package day0524;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		Account acc = new Account();
		Lotto lotto = new Lotto();

		int count = 0;
		
		System.out.println("사용자 ID를 입력하세요");
		String name = sc.next();
		User player = new User(name, acc);

		while (true) {

			count++;

//			lotto.times = count; // 여기

			System.out.println("어떤 일을 수행할까요");
			System.out.println("1.계좌입금");
			System.out.println("2.로또구매");
			System.out.println("3.잔액조회");
			System.out.println("4.유저정보출력");

			int n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.println("입금할 금액을 입력하세요");
				long money = sc.nextInt();
				try {
					acc.deposit(money);
				} catch (Exception e) {
				}
				break;
			case 2:
				System.out.println("로또 몇 개 구매 하시겠어요?");
				int time = sc.nextInt();
				player.buyLotto(time);
				break;
			case 3:
				System.out.println("현재 잔액은");
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

			lotto.makeLotNumber(); // 로또 클래스에서

//			int winnerRate = lotto.play(player.lotNumbers); // 로또 클래스
//
//			if (winnerRate == 1) {
//				System.out.println("축하합니다 1등입니다");
//				player.withdraw(10000000000L); // 유저 클래스
//			}
//
//			else if (winnerRate == 2) {
//				System.out.println("축하합니다 2등입니다.");
//				player.withdraw(1000000000L);
//			}
//
//			else if (winnerRate == 3) {
//				System.out.println("축하합니다 3등입니다.");
//				player.withdraw(100000000L);
//			}

		}

	}

}
