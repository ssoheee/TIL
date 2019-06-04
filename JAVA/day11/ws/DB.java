package ws;

import java.util.ArrayList;

public abstract class DB<A, B> {

	ArrayList<A> datas = new ArrayList<>();

	public abstract void insert(A Obj);

	public abstract A select(int index);

	public abstract ArrayList<A> selectAll();

	public abstract void update(int index, A Obj);

	public abstract void delete(int index);

}
