package mini.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mini.frame.Biz;
import mini.frame3.Biz3;
import mini.vo.Cart;
import mini.vo.Customer;
import mini.vo.Product;

@Controller
public class CartController {

	@Resource(name = "cartbiz")
	Biz3<Integer, String, Cart> biz;

	@Resource(name = "pbiz")
	Biz<Integer, Product> biz2;

	@RequestMapping("/cart.mc")
	public ModelAndView main(Cart cart, ArrayList<Cart> list, HttpSession session, Customer customer) {
		ModelAndView mv = new ModelAndView();
		
		if(session.getAttribute("loginuser") == null) {
			mv.addObject("center", "login");
			mv.setViewName("main");
		}else {
		customer = (Customer) session.getAttribute("loginuser");
		String cid = customer.getCUSTOMER_ID();
		try {
			list = biz.get(cid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("clist", list);
		mv.addObject("center", "cart");
		mv.setViewName("main");
		}
		return mv;
	}

	@RequestMapping("/addcart.mc")
	public String addcart(HttpServletRequest request, Cart cart, Double product_price, Integer product_no,
			HttpSession session, Customer customer) {
		ModelAndView mv = new ModelAndView();

		Product product = null;

		String pqt = request.getParameter("pro_qt");
		int iqt = Integer.parseInt(pqt);
	
		try {
			product = biz2.get(product_no);

			customer = (Customer) session.getAttribute("loginuser");
			String cid = customer.getCUSTOMER_ID();
			cart.setCustomer_id(cid);
			cart.setProduct_no(product_no);
			cart.setProduct_price(product_price);
			cart.setProduct_qt(iqt);
			cart.setProduct_picture1(product.getProduct_picture1());

			try {
				biz.register(cart);

			} catch (Exception e) {
				e.printStackTrace();
			} 

		} catch (Exception e) {
			e.printStackTrace();

		}
		
		return "redirect:product_detail.mc?product_no=" + product.getProduct_no();
	}

	@RequestMapping("/corder.mc")
	public ModelAndView corder(Cart cart, ArrayList<Cart> list, HttpSession session, Customer customer, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		customer = (Customer) session.getAttribute("loginuser");
	
		String cid = customer.getCUSTOMER_ID();
		try {
			list = biz.get(cid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("colist", list);
		mv.addObject("center", "corder");
		mv.setViewName("main");
		return mv;
	}

	@RequestMapping("/cart_delete.mc")
	public String cart_delete(Cart cart, Integer cart_id) {

		try {
			biz.remove(cart_id);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:cart.mc";
	}

}
