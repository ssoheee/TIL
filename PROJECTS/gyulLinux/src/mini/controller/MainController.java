package mini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mini.frame.Biz;
import mini.vo.Customer;
import mini.vo.Product;

@Controller
public class MainController {
	
	@Resource(name="pbiz")
	Biz<Integer, Product> probiz;
	
	@Resource(name="cbiz")
	Biz<String,Customer> biz;
	
	@RequestMapping("/main.mc")
	public ModelAndView main(Product product,ArrayList<Product> list) {
		ModelAndView mv = new ModelAndView();
		
		try {
			list = probiz.get();
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
		mv.addObject("plist", list);
		mv.addObject("center","center");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/loginimpl.mc")
	public ModelAndView loginimpl(HttpSession session, ModelAndView mv,
			HttpServletRequest request, HttpServletResponse response,ArrayList<Product> list) {
		String CUSTOMER_ID= request.getParameter("CUSTOMER_ID");
		String CUSTOMER_PWD= request.getParameter("CUSTOMER_PWD");
		MDC.put("userid", CUSTOMER_ID);
		
		try {
			Customer dbuser = biz.get(CUSTOMER_ID);
			if(CUSTOMER_PWD.equals(dbuser.getCUSTOMER_PWD())) {
				session.setAttribute("loginuser", dbuser);
				
				
				
			}else {
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out = response.getWriter();
				
				out.println("<script>alert('��й�ȣ�� Ʋ�Ƚ��ϴ�.'); location.href='login.mc'</script>");
				out.flush();
			}
		} catch (Exception e) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out;
			try {
				out = response.getWriter();
				out.println("<script>alert('���̵� Ʋ�Ƚ��ϴ�.'); location.href='login.mc'</script>");
				out.flush();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}	
			e.printStackTrace();
		}
		try {
			list = probiz.get();
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		mv.addObject("plist", list);
		mv.addObject("center","center");
		mv.setViewName("main");
		return mv;
		
	}
	
	@RequestMapping("/logout.mc")
	public ModelAndView logout(ModelAndView mv,
			HttpSession session,ArrayList<Product> list) {
		if(session != null) {
			session.invalidate();
		
		}
		try {
			list = probiz.get();
		} catch (Exception e) {	
			e.printStackTrace();
		}
		mv.addObject("plist", list);
		mv.addObject("center","center");
		mv.setViewName("main");
		return mv;
		
	}
	
	@RequestMapping("/customerupdate.mc")
	public ModelAndView cupdate(ModelAndView mv,
			String CUSTOMER_ID) {
		Customer customer =null;
		try {
			customer = biz.get(CUSTOMER_ID);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.addObject("customerupdate",customer);
		mv.addObject("center","cupdate");
		mv.setViewName("main");
		
		return mv;
		
	}

	@RequestMapping("/customerupdateimpl.mc")
	public ModelAndView uupdcustomerupdateimplate(HttpServletRequest request,Customer customer,String CUSTOMER_ID,HttpServletResponse response) {
		ModelAndView mv= new ModelAndView();
		System.out.println(customer);
		try {
			biz.modify(customer);
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out;
			
				out = response.getWriter();
				out.println("<script>alert('�����Ǿ����ϴ�.'); location.href='main.mc'</script>");
				out.flush();
				
				mv.addObject("center","cupdate");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		mv.setViewName("main");
		return mv;
	
	}
	
}
