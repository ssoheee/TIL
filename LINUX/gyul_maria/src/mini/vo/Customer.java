package mini.vo;

public class Customer {
	String CUSTOMER_ID;
	String CUSTOMER_PWD;
	String CUSTOMER_NM;
	String CUSTOMER_PHONE;
	String CUSTOMER_ADDR;
	String CUSTOMER_EMAIL;
	char CUSTOMER_ADMIN;

	public Customer() {
		
	}

	public Customer(String cUSTOMER_ID, String cUSTOMER_PWD, String cUSTOMER_NM, String cUSTOMER_PHONE,
			String cUSTOMER_ADDR, String cUSTOMER_EMAIL, char cUSTOMER_ADMIN) {
		
		CUSTOMER_ID = cUSTOMER_ID;
		CUSTOMER_PWD = cUSTOMER_PWD;
		CUSTOMER_NM = cUSTOMER_NM;
		CUSTOMER_PHONE = cUSTOMER_PHONE;
		CUSTOMER_ADDR = cUSTOMER_ADDR;
		CUSTOMER_EMAIL = cUSTOMER_EMAIL;
		CUSTOMER_ADMIN = cUSTOMER_ADMIN;
	}

	public Customer(String cUSTOMER_ID, String cUSTOMER_PWD, String cUSTOMER_NM, String cUSTOMER_PHONE,
			String cUSTOMER_ADDR, String cUSTOMER_EMAIL) {
		
		CUSTOMER_ID = cUSTOMER_ID;
		CUSTOMER_PWD = cUSTOMER_PWD;
		CUSTOMER_NM = cUSTOMER_NM;
		CUSTOMER_PHONE = cUSTOMER_PHONE;
		CUSTOMER_ADDR = cUSTOMER_ADDR;
		CUSTOMER_EMAIL = cUSTOMER_EMAIL;
	}
	

	public Customer(String cUSTOMER_PWD, String cUSTOMER_NM, String cUSTOMER_PHONE, String cUSTOMER_ADDR,
			String cUSTOMER_EMAIL) {
		
		CUSTOMER_PWD = cUSTOMER_PWD;
		CUSTOMER_NM = cUSTOMER_NM;
		CUSTOMER_PHONE = cUSTOMER_PHONE;
		CUSTOMER_ADDR = cUSTOMER_ADDR;
		CUSTOMER_EMAIL = cUSTOMER_EMAIL;
	}

	public Customer(String cUSTOMER_ID) {
		
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public String getCUSTOMER_PWD() {
		return CUSTOMER_PWD;
	}

	public void setCUSTOMER_PWD(String cUSTOMER_PWD) {
		CUSTOMER_PWD = cUSTOMER_PWD;
	}

	public String getCUSTOMER_NM() {
		return CUSTOMER_NM;
	}

	public void setCUSTOMER_NM(String cUSTOMER_NM) {
		CUSTOMER_NM = cUSTOMER_NM;
	}

	public String getCUSTOMER_PHONE() {
		return CUSTOMER_PHONE;
	}

	public void setCUSTOMER_PHONE(String cUSTOMER_PHONE) {
		CUSTOMER_PHONE = cUSTOMER_PHONE;
	}

	public String getCUSTOMER_ADDR() {
		return CUSTOMER_ADDR;
	}

	public void setCUSTOMER_ADDR(String cUSTOMER_ADDR) {
		CUSTOMER_ADDR = cUSTOMER_ADDR;
	}

	public String getCUSTOMER_EMAIL() {
		return CUSTOMER_EMAIL;
	}

	public void setCUSTOMER_EMAIL(String cUSTOMER_EMAIL) {
		CUSTOMER_EMAIL = cUSTOMER_EMAIL;
	}

	public char getCUSTOMER_ADMIN() {
		return CUSTOMER_ADMIN;
	}

	public void setCUSTOMER_ADMIN(char cUSTOMER_ADMIN) {
		CUSTOMER_ADMIN = cUSTOMER_ADMIN;
	}

	@Override
	public String toString() {
		return "Customer [CUSTOMER_ID=" + CUSTOMER_ID + ", CUSTOMER_PWD=" + CUSTOMER_PWD + ", CUSTOMER_NM="
				+ CUSTOMER_NM + ", CUSTOMER_PHONE=" + CUSTOMER_PHONE + ", CUSTOMER_ADDR=" + CUSTOMER_ADDR
				+ ", CUSTOMER_EMAIL=" + CUSTOMER_EMAIL + ", CUSTOMER_ADMIN=" + CUSTOMER_ADMIN + "]";
	}

	
	


}
