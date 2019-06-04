package calc;

public class Calc {
	
	// attribute
	private int[] data;
	
	// attribute �ʱ�ȭ (constructor), return Ÿ�� ���� X, �����ε� ����
	public Calc() {
	}
	public Calc(int[] data) {
		this.data = data;
	}

	// 1. sum
	public int sum() {
		int sum = 0; // sum �Լ� ������ ����ߴٰ� ����, �Լ� ���� ���Ƶ� ��
		for (int a : data) {
			sum += a;
		}
		return sum;
	}

	public double avg() {
		double avg = 0;
		avg = (double) (sum() / data.length); // sum �����ͼ� ������
		return avg;

	}
	
	// 2. Sort Asc asort
	public int[] asort() { // �迭�� �����ϴ� �Լ��� ���ϰ� Ȯ���ϱ�!!                                                                                        
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) { // ó�� ���� ���ϸ� �� �� �񱳸� ��������
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		return data;

	}

	// 3. Sort Desc dsort
	public int[] dsort() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) { // ó�� ���� ���ϸ� �� �� �񱳸� ��������
				if (data[j] < data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		return data;
	}
	

}
