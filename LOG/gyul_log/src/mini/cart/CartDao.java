package mini.cart;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mini.frame3.Dao3;
import mini.mapper.CartMapper;
import mini.mapper.CustomerMapper;
import mini.vo.Cart;

@Repository("cartdao")
public class CartDao implements Dao3<Integer, String, Cart> {
	@Autowired
	CartMapper cartm;
	@Override
	public void insert(Cart v) throws Exception {
		cartm.insert(v);
		
	}

	@Override
	public void update(Cart v) throws Exception {
		cartm.update(v);
		
	}

	@Override
	public void delete(Integer i) throws Exception {
		cartm.delete(i);
		
	}

	@Override
	public ArrayList<Cart> select(String s) throws Exception {
		
		return cartm.select(s);
	}

	@Override
	public ArrayList<Cart> select() throws Exception {
		
		return cartm.selectall();
	}

}
