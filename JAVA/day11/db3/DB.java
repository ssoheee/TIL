package db3;

public abstract class DB<T,U> { // ������ ������ ������ �ΰ��� Ÿ���� ���ڴ�.
	
	public abstract void insert(T obj);
	public abstract T select(U obj); // T:User, U:String

}
