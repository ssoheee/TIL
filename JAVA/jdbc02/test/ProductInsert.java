package test;

import com.ProductDao;

import frame.Dao;
import vo.Product;

public class ProductInsert {

	public static void main(String[] args) {
		Dao<String,Product> dao = new ProductDao();
		Product p = new Product("P20","SHIRTS",5000);
		try {
			dao.insert(p);;
			System.out.println("Product Updated");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
