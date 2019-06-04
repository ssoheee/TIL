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
	public abstract Object select(Object obj); // !! 객체를 리턴시킴 !!
	public abstract void delete(Object obj); // 특정한 객체가 아닌 parent 타입 입력

}
