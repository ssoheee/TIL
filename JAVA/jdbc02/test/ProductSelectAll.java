package test;

import com.ProductDao;


import frame.Dao;
import vo.Product;


public class ProductSelectAll {

	public static void main(String[] args) {
		Dao<String, Product> dao = new ProductDao();
		try {
			System.out.println(dao.select());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
