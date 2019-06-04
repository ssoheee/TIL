package db3;

public abstract class DB<T,U> { // 무엇이 들어올지 모르지만 두가지 타입을 쓰겠다.
	
	public abstract void insert(T obj);
	public abstract T select(U obj); // T:User, U:String

}
