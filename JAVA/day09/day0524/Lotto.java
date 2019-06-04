package day0524;

import java.util.Random;

public class Lotto {

	private int times;
	private int[] lottoNum;

	public int[] getLottoNum() {
		return lottoNum;
	}

	public Lotto() {
	}

	public void makeLotNumber() {
		
		Random r = new Random();
		
		int num[] = new int [6];
		for (int i = 0; i < 6; i++) {
			num[i] = r.nextInt(20) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
			lottoNum[i]= num[i];
		}
		
	}
	
	public void play() {
		
	}
	
	
}

//		
//		this.times = times;
//		this.lottoNum = num;
//		
//	}
//	
//	public void play ()
//	
