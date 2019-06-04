package db;

public abstract class Dao {

	private String ip;

	public Dao() {
	}

	public Dao(String ip) {
		this.ip = ip;
	}

	public void connection() {
		System.out.println(ip + " : connedcted..");
	}

	public void close() {
		System.out.println(ip + " : closed..");
	}
	
	public abstract void insert(Object obj);
	public abstract Object select(Object obj); // !! ��ü�� ���Ͻ�Ŵ !!
	public abstract void delete(Object obj); // Ư���� ��ü�� �ƴ� parent Ÿ�� �Է�

}
