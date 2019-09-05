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
import mini.vo.Orderm;
import mini.vo.Product;

@Controller
public class OrderController {

	@Resource(name = "cartbiz")
	Biz3<Integer, String, Cart> biz;

	@Resource(name = "pbiz")
	Biz<Integer, Product> biz2;
	
	@Resource(name = "ombiz")
	Biz3<Integer, String, Orderm> biz3;

	@RequestMapping("/order.mc")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("center", "order");
		mv.setViewName("main");
		return mv;
	}

	@RequestMapping("/corderimpl.mc")
	public ModelAndView corder(Cart cart, HttpSession session, Customer customer, HttpServletRequest request, Orderm orderm) {
		ModelAndView mv = new ModelAndView();
		customer = (Customer) session.getAttribute("loginuser");
		
		String cid = customer.getCUSTOMER_ID();
		String cqt = request.getParameter("qtt");
		String ctt = request.getParameter("ttt");
		String caddr = request.getParameter("address");
		String cphone = request.getParameter("phone");
		String cstatus="success";
		String cpayment=request.getParameter("payment");
		orderm.setCustomer_id(cid);
		
		orderm.setOrder_qt(Integer.parseInt(cqt));
		
		orderm.setDt_addr(caddr);
		orderm.setDt_contact_no(cphone);

		orderm.setOrder_status(cstatus);

		orderm.setOrder_payment(cpayment);

		
		try {
			biz3.register(orderm);
		} catch (Exception e) {
			e.printStackTrace();
		}

		mv.addObject("center", "orderdetail");
		mv.setViewName("main");
		return mv;
	}
	
	
}
