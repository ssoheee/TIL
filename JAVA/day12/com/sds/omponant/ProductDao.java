package com.sds.omponant;

import java.util.ArrayList;

import com.sds.frame.Dao;
import com.sds.vo.Product;

public class ProductDao extends Dao<Integer, Product> {

	@Override
	public void insert(Product v) throws Exception {
		if (v.getId()==1000) {
			throw new Exception("E1001");
		}
		System.out.println(v + " Inserted.");
		
	}

	@Override
	public void delete(Integer k) throws Exception {
		if (k==1000) {
			throw new Exception("E1002");
		}
		System.out.println(k + " Deleted.");
		
	}

	@Override
	public void update(Product v) throws Exception {
		if (v.getId()==1000) {
			throw new Exception("E0003");
		}
		System.out.println(v + " Updated.");
	}

	@Override
	public Product select(Integer k) throws Exception {
		Product product = new Product(k, "Phone", 1000000);
		return product;
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(1001,"P1",1000000));
		list.add(new Product(1002,"P2",500000));
		list.add(new Product(1003,"P3",1500000));
		return list;
	}

}
