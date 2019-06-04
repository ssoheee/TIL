package ws;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 0;

		// input	
		while (true) {
			System.out.println("����� �Է��ϼ���");
			size = sc.nextInt();

			if (size >= 4 && size < 10) {
				break;
			} else
				continue;
		} // ������ ���� ����� �ٽ� �Է¹޵���

		int[][] map = new int[size][size];
		boolean[] check = new boolean[101]; // ���� ������ 1-100�̴ϱ�

		// map�� �������� �ֱ�
		Random r = new Random();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				while (true) {
					int temp = r.nextInt(100) + 1;
					// �ð����̱�� �ߺ�üũ
					if (check[temp]) {
						continue;
					} else {
						check[temp] = true;
						map[j][i] = temp;
						break;
					}
				}
			}
		}

		int bingo = 3; // 3����� ���� ����

		System.out.println("�󸶸� �����ðڽ��ϴ�"); // ��� ���� ��������
		int playerCount = sc.nextInt();
		System.out.println(playerCount + "���� �޾ҽ��ϴ�");

		// play ���� -> while ����ؼ� ��� �ݺ��ǵ���!
		while (true) {
			System.out.println(playerCount + "���� ���ҽ��ϴ�");

			if (playerCount == 0) {
				log(size, map);
				System.out.println("���� �����ϴ� ����Ͻðڽ��ϱ�?");
				break;
			}

			System.out.println("���ڸ� �Է��ϼ���");
			int number = sc.nextInt();
			int bingoNumber = 0;
			int count = 0;

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (map[j][i] == number) {
						map[j][i] = 0; 
						count++; // �Է��� ���ڰ� �迭�� ������ 0���� ������ְ�, ���ӽ���Ƚ�� ī��Ʈ
					}
				}
			}

			if (count == 0) {
				System.out.println("��"); // �Է��� ���ڰ� ���� ��
			}

			
			// ���� üũ

			// �밢�� �ΰ� üũ
			int c = 0;
			for (int i = 0; i < size; i++) {
				if (map[i][i] == 0) {
					c++;
				}
			}
			if (c == size) { // �밢�� ������ �Է��� ������ ���� �����Ƿ� ���غ���, ������ ����ѹ�+1
				bingoNumber++;
			}

			c = 0;
			for (int i = size - 1; i >= 0; i--) {
				if (map[i][size - 1 - i] == 0) {
					c++;
				}
			}
			if (c == size) {
				bingoNumber++;
			}

			// ������ üũ
			for (int i = 0; i < size; i++) {
				int d = 0;
				for (int j = 0; j < size; j++) {
					if (map[j][i] == 0) {
						d++;
					}
				}
				if (d == size) {
					bingoNumber++;
				}
			}

			// ������ üũ
			for (int i = 0; i < size; i++) { // ���οʹ� i,j ��ġ�� ����
				int d = 0;
				for (int j = 0; j < size; j++) {

					if (map[i][j] == 0) {
						d++;
					}
				}
				if (d == size) {
					bingoNumber++;
				}
			}

			// ���� ������ �����ֱ�
			if (bingoNumber == 1) {
				System.out.println("�������Դϴ�.");
			} else if (bingoNumber == 2) {
				System.out.println("������");
			}

			// ���ϴ� ���� �Ǹ� ������
			if (bingoNumber == bingo) {
				log(size, map);
				System.out.println("���ӳ�");
				System.out.println("���" + (size * size) + "�����Դϴ� �����մϴ�.");
				break;
			}
			playerCount--; // ������ �ѹ��� ����� ������ ī��Ʈ
		}
		sc.close();
	}
	
	public static void log(int size, int[][] map) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(map[j][i] + " ");
			}
			System.out.println();
		}
	}
}