package test;

import com.ProductDao;

import frame.Dao;
import vo.Product;


public class ProductDelete {

	public static void main(String[] args) {
		Dao<String, Product> dao = new ProductDao();

		try {
			dao.delete("P03");
			;
			System.out.println("Product Deleted");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
