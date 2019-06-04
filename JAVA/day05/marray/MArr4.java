package marray;

public class MArr4 {
	public static void main(String[] args) {
		
		String sa[][] = new String[2][3];
		
		for (int i=0; i<sa.length; i++) {
			for (int j=0; j<sa[i].length; j++) {
				sa[i][j] = i+" "+j; // string으로 자동변환됨
			}
		}
		
		for (String temp[]:sa) {
			for (String data:temp) {
				System.out.printf("%S\t", data);
			}
			System.out.println();
		} // tmep와 data는 Stack 영역에 잠시 올라갔다가 for문이 끝남과 동시에 없어짐
		
	}

}
