package calc;

public class Calc {
	
	// attribute
	private int[] data;
	
	// attribute 초기화 (constructor), return 타입 존재 X, 오버로딩 가능
	public Calc() {
	}
	public Calc(int[] data) {
		this.data = data;
	}

	// 1. sum
	public int sum() {
		int sum = 0; // sum 함수 내에서 기능했다가 리턴, 함수 값과 같아도 됨
		for (int a : data) {
			sum += a;
		}
		return sum;
	}

	public double avg() {
		double avg = 0;
		avg = (double) (sum() / data.length); // sum 가져와서 나누기
		return avg;

	}
	
	// 2. Sort Asc asort
	public int[] asort() { // 배열을 리턴하는 함수의 리턴값 확인하기!!                                                                                        
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) { // 처음 값과 비교하며 몇 번 비교를 실행할지
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
			for (int j = 0; j < data.length - 1 - i; j++) { // 처음 값과 비교하며 몇 번 비교를 실행할지
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
