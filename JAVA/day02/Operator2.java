package day02;

public class Operator2 {

	public static void main(String[] args) {
		double d = 3.14356523;
		
		// �Ҽ��� 3�ڸ� ���� ������ ����ϰ� ���
		
		double shortd1 = (int) (d*1000)/1000.0; // Math.floor(d*1000)/1000.0 �̿�
		System.out.println(shortd1);
		
		// �Ҽ��� 3�ڸ� ���� �ݿø��� ����ϰ� ���
		
		double shortd2 = (int) (d*1000+0.5)/1000.0; // Math.round(d*1000)/1000.0 �̿�
		System.out.println(shortd2);
		
		// ���� �ﰢ�� ���μ��ΰ� 5, 4�� �ﰢ���� ������ ���̸� ���Ͻÿ�
		
		int a=5, b=4;
		double c=0;
		c= Math.sqrt(a*a+b*b); // c=Math.sqrt(Math.pow(5,2)+Math.pow(4,2));
		System.out.println(c);

	}

}
