package ws1;

import java.util.Scanner;

public class Bus extends Transportation {

	public int time;

	public Bus() {

	}

	public Bus(Factor factor) {
		super(factor);

	}

	@Override
	public Factor getFactor() {
		// TODO Auto-generated method stub
		return super.getFactor();
	}

	@Override
	public void setFactor(Factor factor) {
		// TODO Auto-generated method stub
		super.setFactor(factor);
	}

	@Override
	public double calcFare() {

		double calcFare = 0.0;
		calcFare = factor.getDistance() * 5 + 900;
		return calcFare;

	}

	@Override
	public int calcTime() {

		time = factor.getDistance() / factor.getVelocity();
		return time;

	}

	Scanner sc = new Scanner(System.in);

	public int rushhour() {

		int num = 0;
		int time2 = 0;
		System.out.println("신호등을 몇 번 만나니 ? ");
		num = sc.nextInt();

		time2 = calcTime() + (num * 2);
		return time2;
	}

	@Override
	public String toString() {
		return "Bus [calcFare()=" + calcFare() + ", calcTime()=" + calcTime() + ", rushhour()=" + rushhour() + "]";
	}

}

