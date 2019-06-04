package day0524;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Account {

	private long balance;
	private String serialNumber;

	public static int cnt = 0;
	public static int serialNum2 = 1000;

	public Account() {

		long time = System.currentTimeMillis();
		SimpleDateFormat now = new SimpleDateFormat("yyyy-mmdd-hhmm-ss");

		String serialNum1 = now.format(new Date(time));
		serialNum2 = serialNum2 + cnt;

		this.balance = balance;
		this.serialNumber = serialNum1 + serialNum2;

		cnt++;
	}

	public long getBalance() throws Exception {
		if (balance < 0)
			throw new Exception("돈을 넣으세요");
		else
			return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void withdraw(long money) throws Exception {

		if (money > balance)
			throw new Exception("출금 할 수 없습니다");
		else
			this.balance -= money;

	}

	public void deposit(long money) throws Exception {
		if (money <= 0)
			throw new Exception("돈을 넣으세요");
		else
			this.balance += money;

	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", serialNumber=" + serialNumber + "]";
	}

}
