package ws;

import java.util.ArrayList;

public class UserDB extends DB<User, String> {

	ArrayList<User> datas = new ArrayList<>();

	@Override
	public void insert(User Obj) {
		datas.add(Obj);
	}

	@Override
	public User select(int index) {
		User temp = datas.get(index);
		return temp;
	}

	@Override
	public ArrayList<User> selectAll() {
		return datas;
	}

	@Override
	public void update(int index, User Obj) {
		datas.set(index, Obj);
	}

	@Override
	public void delete(int index) {
		datas.remove(index);
	}

}
