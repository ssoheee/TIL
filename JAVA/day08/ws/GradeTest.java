package ws;

import java.util.Arrays;

import calc.Calc;

public class GradeTest {

	public static void main(String[] args) {
		
		int subject [] = {70, 80, 65, 100};
		Grade g = new Grade (subject);		
		
		System.out.println("���� ��: "+ g.sum());
		System.out.println("���� ���: "+ g.avg());
		System.out.println("����: "+g.score());
		System.out.println("�ְ���: "+g.max());
		System.out.println("������: "+g.min());
		System.out.println(Arrays.toString(g.asort()));
		System.out.println(Arrays.toString(g.dsort()));
	

	}

}
