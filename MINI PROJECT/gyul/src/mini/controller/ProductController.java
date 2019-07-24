package mini.controller;



import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import mini.frame.Biz;
import mini.vo.Cart;
import mini.vo.Customer;
import mini.vo.Product;

@Controller
public class ProductController {
	
	@Resource(name="pbiz")
	Biz<Integer, Product> biz;
	
	@RequestMapping("/proregister.mc")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("center","product/register");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("proregisterimpl.mc")
	public ModelAndView paddimpl(ModelAndView mv, Product product, ArrayList<Product> list) {
		
		String imgname1 =product.getMf().getOriginalFilename();
		String imgname2 =product.getMf1().getOriginalFilename();
		String imgname3 =product.getMf2().getOriginalFilename();

		product.setProduct_picture1(imgname1);
		product.setProduct_picture2(imgname2);
		product.setProduct_picture3(imgname3);

		try {
			biz.register(product);
			Util.saveFile(product.getMf());
			Util.saveFile(product.getMf1());
			Util.saveFile(product.getMf2());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		try {
			list = biz.get();
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
		mv.addObject("plist", list);
		mv.addObject("center","center");		
		mv.setViewName("main");
		return mv;
	}
	

	
	@RequestMapping("/product_detail.mc")
	public ModelAndView productdetail(HttpServletRequest request, Product product, Integer product_no) {
		ModelAndView mv = new ModelAndView();
		
	     try {
			product  = biz.get(product_no);
			mv.addObject("productdetail",product);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	 	mv.addObject("center","product/detail");
		mv.setViewName("main");
		return mv;
	}

	/* product modify------------------------------------------ */

	@RequestMapping("/product_list.mc")
	public ModelAndView main(Product product,ArrayList<Product> list) {
		ModelAndView mv = new ModelAndView();
		
		try {
			list = biz.get();
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
		mv.addObject("plist", list);
		mv.addObject("center","product/list");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/product_update.mc")
	public ModelAndView product_update(HttpServletRequest request, Product product, Integer product_no) {
		ModelAndView mv = new ModelAndView();
		
	     try {
			product  = biz.get(product_no);
			mv.addObject("productupdate",product);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	 	mv.addObject("center","product/update");
		mv.setViewName("main");
		return mv;
	}
	

	@RequestMapping("/product_updateimpl.mc")
	public String product_updateimpl(MultipartHttpServletRequest request, ModelAndView mv, Product product, String original_pic1,String original_pic2,String original_pic3 ) {
		
		String imgname1 =product.getMf().getOriginalFilename();
		String imgname2 =product.getMf1().getOriginalFilename();
		String imgname3 =product.getMf2().getOriginalFilename();
		
		if(imgname1 != null && imgname1 != "") {
			product.setProduct_picture1(imgname1);
		}
		if(imgname2 != null && imgname2 != "") {
			product.setProduct_picture2(imgname2);
		}
		if(imgname3 != null && imgname3 != "") {
			product.setProduct_picture3(imgname3);
		}

		if(imgname1 == null || imgname1 == "") {
			product.setProduct_picture1(original_pic1);
		}
		if(imgname2 == null || imgname2 == "") {
			product.setProduct_picture2(original_pic2);
		}
		if(imgname3 == null || imgname3 == "") {
			product.setProduct_picture3(original_pic3);
		}
		
		try {

			biz.modify(product);
			
			if(imgname1 != null && imgname1 !="") {
				Util.saveFile(product.getMf());
			}
			if(imgname2 != null && imgname2 !="") {
				Util.saveFile(product.getMf1());
				}
			if(imgname3 != null && imgname3 !="") {
				Util.saveFile(product.getMf2());
				}

		} catch (Exception e) {
			
			e.printStackTrace();
		}
				
		return "redirect:product_detail.mc?product_no="+product.getProduct_no();
	}
	
	@RequestMapping("/product_delete.mc")
	public String pdelete(Product product,Integer product_no) {
		
		try {
			biz.remove(product_no);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:product_list.mc";
	}

	@RequestMapping("/dorder.mc")
	public ModelAndView dorder(HttpServletRequest request, Product product, Integer product_no) {
		ModelAndView mv = new ModelAndView();
		String pqt = request.getParameter("pro_qt");
		int iqt = Integer.parseInt(pqt);

		try {
			product  = biz.get(product_no);
			mv.addObject("dorder",product);
			mv.addObject("dpqt",pqt);
			mv.addObject("diqt",iqt);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	 	mv.addObject("center","dorder");
		mv.setViewName("main");
		return mv;
	}
	
	
}
