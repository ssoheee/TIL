package com.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.frame.Biz;
import com.oreilly.servlet.MultipartRequest;
import com.product.ProductBiz;
import com.vo.Product;

@WebServlet({ "/ProductServlet", "/product" })
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Biz<Integer, Product> biz;

	public ProductServlet() {
		biz = new ProductBiz();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cmd = request.getParameter("cmd");
		String next = "";
		if (cmd.equals("add")) {
			next = "product/add";
		} else if (cmd.equals("addimpl")) {
			MultipartRequest mr = new MultipartRequest(request, "C:\\web\\day1333\\web\\img", 1024 * 1024 * 100,
					"UTF-8");
			String name = mr.getParameter("name");
			String price = mr.getParameter("price");
			String imgname = mr.getOriginalFileName("imgname");
			try {
				biz.register(new Product(name, Double.parseDouble(price), imgname));
				next = "product/pok";
			} catch (Exception e) {
				next = "product/pfail";
				e.printStackTrace();
			}
		} else if (cmd.equals("list")) {
			ArrayList<Product> list = null;
			try {
				list = biz.get();
				request.setAttribute("plist", list);
			} catch (Exception e) {

			}
			next = "product/list";
		} else if (cmd.equals("detail")) {
			String i = request.getParameter("id");
			int id = Integer.parseInt(i);
			try {
				Product product = null;
				product = biz.get(id);
				request.setAttribute("pd", product);
				next = "product/detail";
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (cmd.equals("delete")) {
			String id = request.getParameter("id");
			try {
				biz.remove(Integer.parseInt(id));
				response.sendRedirect("req?type=product&cmd=list");
				return;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (cmd.equals("update")) {
			String i = request.getParameter("id");
			int id = Integer.parseInt(i);
			Product product = null;
			try {
				product = biz.get(id);
				request.setAttribute("pu", product);
				next = "product/update";
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (cmd.equals("updateimpl")) {
			MultipartRequest mr = new MultipartRequest(request, "C:\\web\\day1333\\web\\img", 1024 * 1024 * 100,
					"UTF-8");
			String i = mr.getParameter("id");
			int id = Integer.parseInt(i);
			String name = mr.getParameter("name");
			String price = mr.getParameter("price");
			String imgname = mr.getParameter("imgname");
			String newimgname = mr.getOriginalFileName("newimgname");

			if (newimgname == null || newimgname.equals("")) {
				try {
					biz.modify(new Product(id, name, Double.parseDouble(price), imgname));
				} catch (Exception e) {
					next = "product/pfail";
				}
			} else {
				try {
					biz.modify(new Product(id, name, Double.parseDouble(price), newimgname));
				} catch (Exception e) {
					next = "product/pfail";
				}
			}

			response.sendRedirect("req?type=product&cmd=detail&id=" + id);
			return;
		}

		RequestDispatcher rd = request.getRequestDispatcher(next + ".jsp");
		rd.forward(request, response);
	}

}
