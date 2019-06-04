package ws;

import java.util.ArrayList;

public class ProductDB extends DB<Product, Integer> {

	ArrayList<Product> datas = new ArrayList<>();

	@Override
	public void insert(Product Obj) {
		datas.add(Obj);
	}

	@Override
	public Product select(int index) {
		Product temp = datas.get(index);
		return temp;
	}

	@Override
	public ArrayList<Product> selectAll() {
		return datas;
	}

	@Override
	public void update(int index, Product Obj) {
		datas.set(index, Obj); // 값을 바꾸는 것
	}

	@Override
	public void delete(int index) {
		datas.remove(index);
	}

}
