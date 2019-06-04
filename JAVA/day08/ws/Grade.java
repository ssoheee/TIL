package ws;

public class Grade {

	private int[] subject;

	public Grade() {
	}

	public Grade(int[] subject) {
		this.subject = subject;
	}

	public int sum() {
		int sum = 0;
		for (int data : subject) {
			sum += data;
		}
		return sum;
	}

	public double avg() {
		double avg = 0;
		avg = (double) (sum() / subject.length); // sum 가져와서 나누기
		return avg;

	}

	public char score() {
		double avg = avg();
		char score = ' ';
		if (avg >= 90) {
			score = 'A';
		} else if (avg >= 80) {
			score = 'B';
		} else if (avg >= 70) {
			score = 'C';
		} else if (avg >= 60) {
			score = 'D';
		} else {
			score = 'F';
		}
		return score;
	}

	public String max() {
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < subject.length; i++) {
			if (max < subject[i]) {
				max = subject[i];
				maxIndex = i;
			}
		}
		switch (maxIndex) {
		case 0:
			return "Korean";
		case 1:
			return "English";
		case 2:
			return "Math";
		case 3:
			return "Science";

		default:
			return "ERROR"; // return 값이 꼭 있어야 하므로 디폴트도 설정

		}
	}

	public String min() {
		int min = subject[0];
		int minIndex = 0;
		for (int i = 0; i < subject.length; i++) {
			if (min > subject[i]) {
				min = subject[i];
				minIndex = i;
			}
		}
		switch (minIndex) {
		case 0:
			return "Korean";
		case 1:
			return "English";
		case 2:
			return "Math";
		case 3:
			return "Science";


		default:
			return "ERROR";

		}
	}

	// 오름차순
	public int[] asort() {
		for (int i = 0; i < subject.length; i++) {
			for (int j = 0; j < subject.length - 1 - i; j++) {
				if (subject[j] > subject[j + 1]) {
					int temp = subject[j];
					subject[j] = subject[j + 1];
					subject[j + 1] = temp;
				}
			}
		}
		return subject;
	}

	// 내림차순
	public int[] dsort() {
		for (int i = 0; i < subject.length; i++) {
			for (int j = 0; j < subject.length - 1 - i; j++) {
				if (subject[j] < subject[j + 1]) {
					int temp = subject[j];
					subject[j] = subject[j + 1];
					subject[j + 1] = temp;
				}
			}
		}
		return subject;
	}

}
