package forwhile;

public class WEx6 {

	public static void main(String[] args) {

		// �������� ����Ͻÿ�
		// Ȧ�� �ܸ� ����Ͻÿ�
		// ����� 49�� �� ���߼���

//		int result =0;
//		for (int i=2; i<=9; i++) {
//			
//			if (i%2==0) {
//				continue;
//			} // �� �κ� �߿�! �����ؾ���
//			
//			for (int j=1; j<10; j++) {
//				if (result==49)
//				{
//					break;
//				}
//				result = i*j;	
//				System.out.println(i+"*"+j+"= "+result);				
//			}
//			System.out.println();
//		}

		out: 
			for (int i = 2; i <= 9; i++) {

			if (i % 2 == 0) {
				continue;
			}
			int result = 0;
			for (int j = 1; j < 10; j++) {
				if (result == 49) {
					break out; // out ��ġ�� �����Ե� (while �տ� ���̸� while ������ ����)
				}
				result = i * j;
				System.out.println(i + "*" + j + "= " + result);
			}
			System.out.println();
		}

	}

}
