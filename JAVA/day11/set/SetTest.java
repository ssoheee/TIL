package set;

import java.util.HashSet;
import java.util.Random;

public class SetTest {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();

//		set.add(9);
//		set.add(2);
//		set.add(2);
//		set.add(9);
//		set.add(3);
//		
//		System.out.println(set.toString()); // !! set�� �ߺ� ��� ���� !!, ������ �ִ´�� �̷������ ����
		Random r = new Random();
		while (true) {
			set.add(r.nextInt(45) + 1);
			if (set.size() == 6) {// size -> ����
				break;
			}

		}
		System.out.println(set.toString());
	}

}
