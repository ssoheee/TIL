package ws;

import java.util.Arrays;

import calc.Calc;

public class GradeTest {

	public static void main(String[] args) {
		
		int subject [] = {70, 80, 65, 100};
		Grade g = new Grade (subject);		
		
		System.out.println("과목 합: "+ g.sum());
		System.out.println("과목 평균: "+ g.avg());
		System.out.println("평점: "+g.score());
		System.out.println("최고점: "+g.max());
		System.out.println("최저점: "+g.min());
		System.out.println(Arrays.toString(g.asort()));
		System.out.println(Arrays.toString(g.dsort()));
	

	}

}
