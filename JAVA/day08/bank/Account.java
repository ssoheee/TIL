package bank;

public class Account {
	
	private String owner;
	private String accNum;
	private double balance;
	public static int cnt = 0; // 클래스 변수, method 영역에 올라감
	
	public Account() {
	}

	public Account(String owner, String accNum, double balance) throws Exception {
		if(accNum.length()!=5) {
			throw new Exception("E1000");
		}		
		this.owner = owner;
		this.accNum = accNum+cnt;
		this.balance = balance;
		cnt++;
	}

	public String getOwner() { // 정보를 바꾸면 안되니까 getter만 만듬
		return owner;
	}

	public String getAccNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [owner=" + owner + ", accNum=" + accNum + ", balance=" + balance + "]";
	}
	

	public void withdraw(double money) throws Exception {		
		if (money<=0) {
			throw new Exception("E0001");
		}		
		if(this.balance<money) {
			throw new Exception("E0002");
		}
		this.balance -= money;		
	}
	
	public void deposit(double money) throws Exception  {		
		if (money<=0) {
			throw new Exception("E0001");
		}			
		this.balance += money;
	}
}
