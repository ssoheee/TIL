package mini.cart;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import mini.frame3.Biz3;
import mini.frame3.Dao3;
import mini.vo.Cart;
import mini.vo.Customer;

@Service("cartbiz")
public class CartBiz implements Biz3<Integer, String, Cart> {

	@Resource(name="cartdao")
	Dao3<Integer, String, Cart> dao3;
	@Override
	public void register(Cart v) throws Exception {
		dao3.insert(v);
		
	}

	@Override
	public void modify(Cart v) throws Exception {
		dao3.update(v);
		
	}

	@Override
	public void remove(Integer i) throws Exception {
		dao3.delete(i);
		
	}

	@Override
	public ArrayList<Cart> get(String s) throws Exception {
		
		return dao3.select(s);
	}

	@Override
	public ArrayList<Cart> get() throws Exception {
		
		return dao3.select();
	}

}
