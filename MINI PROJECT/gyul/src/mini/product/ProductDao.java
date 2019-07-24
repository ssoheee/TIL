package mini.product;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mini.frame.Dao;
import mini.mapper.ProductMapper;
import mini.vo.Product;


@Repository("pdao")
public class ProductDao implements Dao<Integer, Product> {
	
	@Autowired
	ProductMapper pm;
	
	
	@Override
	public void insert(Product v) throws Exception {
		pm.insert(v);
	}

	@Override
	public void update(Product v) throws Exception {
		pm.update(v);		
	}

	@Override
	public void delete(Integer k) throws Exception {
		pm.delete(k);
		
	}

	@Override
	public Product select(Integer k) throws Exception {
		pm.select(k);
		return pm.select(k);
	}

	@Override
	public ArrayList<Product> select() throws Exception {
	
		return pm.selectall();
	}

}
