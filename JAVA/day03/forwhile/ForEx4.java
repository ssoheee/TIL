package forwhile;

public class ForEx4 {

	public static void main(String[] args) {
		// �ֻ����� 3�� ������ �� ���� �� �ִ� ���� ��츦 ���Ͻÿ�		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				for(int k=1; k<=6; k++) {
					System.out.printf("%d%d%d \t",i,j,k);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
