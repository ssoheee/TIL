package day0524;

import java.util.Arrays;
import java.util.Scanner;

public class User {

	String name;
	Account acc;
	int[][] usersNum;

	public User() {
	}

	public User(String name, Account acc) {
		this.name = name;
		this.acc = acc;
	}

	public User(String name, Account acc, int[][] usersNum) {
		this.name = name;
		this.acc = acc;
		this.usersNum = usersNum;
	}

	public void buyLotto(int number) {
		Scanner sc = new Scanner(System.in);
		usersNum = new int[number][6];
		boolean[] check = new boolean[21];

		for (int i = 0; i < number; i++) {
			System.out.println((i + 1) + "회차 로또번호를 입력하세요");
			
			for (int j = 0; j < 6; j++) {		
				int num = sc.nextInt();
				if (num > 20 || num <= 0) {
					System.out.println("잘못된 숫자를 입력했습니다");
					j--;
					continue;
				}

				if (check[num] == true) {
					System.out.println("숫자를 중복되게 입력할 수 없습니다");
					j--;
					continue;
				} else if (check[num] == false) {
					check[num] = true;
					usersNum[i][j] = num;
				}
			}
		}
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", acc=" + acc + "]";
	}


}