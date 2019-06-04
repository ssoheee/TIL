package com.sds.test;

import java.util.ArrayList;

import com.sds.frame.Biz;
import com.sds.omponant.ProductBiz;
import com.sds.vo.Product;

public class ProductSelectAll {

	public static void main(String[] args) {
		Biz<Integer, Product> biz = new ProductBiz();
		ArrayList<Product> list = null;
		try {
			list = biz.get();
			for (Product p : list) {
				System.out.println(p);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
