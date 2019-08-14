package mini.mapper;

import java.util.ArrayList;

import mini.vo.Cart;

public interface CartMapper {
	public void insert(Cart obj);
	public void delete(int obj);
	public void update(Cart obj);
	public ArrayList<Cart> select(String obj);
	public ArrayList<Cart> selectall();
}
