package com.test;

import com.product.ProductBiz;

import com.frame.Biz;
import com.vo.Product;

public class ProductDelete {
	public static void main(String[] args) {

		Biz<String, Product> biz = new ProductBiz();

		try {
			biz.remove("id5");
			System.out.println("Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		;
	}

}
