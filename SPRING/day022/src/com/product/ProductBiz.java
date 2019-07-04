package com.product;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;

@Service("pbiz")
public class ProductBiz implements Biz<Integer, Product> {
	
	@Resource(name="pd")
    Dao<Integer, Product> dao;	
	
  //��ü ���� �� �� �� ���ʷ� ����
  	public void startBiz() {
  		System.out.println("Start ProductBiz ...");
  	}
  	//��ü�� �Ҹ�Ǵ� ������ �� �� ����
  	public void endBiz() {
  		System.out.println("End ProductBiz ...");
  	}
  	
	public void setDao(Dao<Integer, Product> dao) {
		this.dao = dao;
	}
	
	@Override
	public void insert(Product v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void update(Product v) throws Exception {
		dao.update(v);		
	}

	@Override
	public void delete(Integer k) throws Exception {
		dao.delete(1);
	}

	@Override
	public Product select(Integer k) throws Exception {
		Product prd= dao.select(k);
		return prd;
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		return dao.select();
	}

}
