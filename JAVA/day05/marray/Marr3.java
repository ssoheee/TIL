package marray;

import java.util.Random;

public class Marr3 {

	public static void main(String[] args) {

		// 2차원 배열을 이용하여 5명 학생의 4과목 점수를 생성하여 출력하시오

		Random r = new Random();
		int ma[][] = new int[5][4];
		int stusum = 0, subsum = 0, totsum = 0;
		double stuavg = 0, subavg = 0, totavg = 0;

		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma[i].length; j++) {
				ma[i][j] = r.nextInt(100) + 1;
			}
		}

		for (int temp[] : ma) {
			for (int data : temp) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}

		// 학생 별 평균
		System.out.println("학생별 평균");
		for (int i = 0; i < ma.length; i++) {
			stusum = 0;
			stuavg = 0;
			for (int j = 0; j < ma[i].length; j++) {
				stusum += ma[i][j];
				stuavg = (double) stusum / (ma[i].length); // 4를 ma.length로 대체하면 값이 이상하게 나옴 -> 왜그러지 !!!!!!!!!!!!!!
			}
			System.out.println(stuavg);

		}

		// 과목별
		System.out.println("과목별 평균");
		for (int j = 0; j < ma[0].length; j++) { // 과목별은 포문에서 설정 바뀌는거 잘 보기
			subsum = 0;
			subavg = 0;
			for (int i = 0; i < ma.length; i++) {
				subsum += ma[i][j];
				subavg = (double) subsum / (ma.length);
			}
			System.out.println(subavg);
		}

		// 전체 평균 출력

	}

}
