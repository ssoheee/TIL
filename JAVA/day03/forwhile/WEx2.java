package forwhile;

import java.util.Scanner;

public class WEx2 {

	public static void main(String[] args) {
		
		while (true) {
			
			System.out.println("Input Comand..");
			Scanner sc = new Scanner (System.in);
			String cmd = sc.next(); // �Է��� �޾ƾ߸� �۵���
			
			if(cmd.equals("q")) {
				System.out.println("Bye...");
				sc.close();
				break; // while�� ���� ������ �ϴ� ��, return�� ������ ���� ����
			}else if(cmd.equals("i")) {
				System.out.println("Input 2 Num");
				int a = Integer.parseInt(sc.next());
				System.out.println(a);
			}
			else if(cmd.equals("s")) {
				System.out.println("Selected..");
			}
			else {
				System.out.println("Re-Try");
				continue; // end while�� ������
			}
			System.out.println("Completed...");

		} // end while
		
		System.out.println("System Exit..");	

		}
}
