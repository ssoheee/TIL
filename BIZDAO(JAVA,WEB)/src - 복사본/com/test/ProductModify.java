package com.test;

import com.product.ProductBiz;

import com.frame.Biz;
import com.vo.Product;

public class ProductModify {

	public static void main(String[] args) {

		Biz<String, Product> biz = new ProductBiz();
		Product Product = new Product("id1", "shirts", 5000.00, "shirt_Img");
		try {
			biz.modify(Product);
			System.out.println("Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		;
	}

}

