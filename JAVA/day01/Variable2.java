package day01;

public class Variable2 {
	
	public static void main(String[] args) {
		boolean b = true;
		char c = 'a';
		byte by = 10;
		short sh = 10;
		int i = 10;
		int i1 = 120000000;
		int i2 = 120000000;
		long ll = 10;
		by = (byte) (20+10) ;
		sh = (short) (100+i);
		ll = i1+i2; //int���� ���� �� �Ѿ�� ���� ©���� �� -> (long)i1 + (long)i2�� �ٲ����
		// long 11 = 2200000000000; ���� ������ int�� default�̱� ������ ������ ���ڰ��� ���� ���� ������
		// long ll = 220000000000000L; �̷������� ǥ���ϸ� ���� �ȶ߰� �� ��Ÿ�� �� ����
		System.out.println(by);
		
		sh = 12+12; 
		/* ���� �Ǹ� �ȵ� int+int�̱� ������(����Ʈ�� int��)
		 * sh=(short)(12+12);������ �ڹٿ��� �ڵ������� ó������
		 */
		
		float f=1.0f; // float f=1.0f;��� �����
		double d=1.0; //�Ǽ��� double�� default, ������ int
		
		float ff= 1.0f+1.0f; 
		final int a=10; //����� ��
	}

}
