package com.test;

import com.frame.Biz;
import com.product.ProductBiz;
import com.vo.Product;

public class ProductInsert {

	public static void main(String[] args) {
		int i;
		
		for(i=1; i<=10; i++) {
			Product p = new Product("id"+i, "pants"+i, 2000.00, "temp");
			Biz<String, Product> biz = new ProductBiz();
	
			try {
				biz.register(p);
				System.out.println("OK");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
