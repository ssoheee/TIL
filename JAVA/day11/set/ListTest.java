package set;

import java.util.ArrayList;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(); // 중복 허용, 순서는 넣는대로
		
		Random r = new Random();
		while (true) {
			list.add(r.nextInt(45) + 1);
			if (list.size() == 10) {// size -> 갯수
				break;
			}

		}

		for (Integer i:list) {
			System.out.println(i);
		}
		
	}

}
