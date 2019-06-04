package test;

import com.ProductDao;

import frame.Dao;
import vo.Product;

public class ProductSelect {

	public static void main(String[] args) {
		Dao<String, Product> dao = new ProductDao();
		try {
			System.out.println(dao.select("P10"));
			System.out.println("Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
