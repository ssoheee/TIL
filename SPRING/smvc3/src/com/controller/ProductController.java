package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.vo.Product;
import com.vo.User;

@Controller
public class ProductController {

	@Resource(name="pbiz")
	Biz<Integer,Product> biz;
	
	@RequestMapping("/productadd.mc")
	public ModelAndView padd() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("center", "product/add");
		mv.addObject("navi", Navi.productadd);
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/productaddimpl.mc")
	public ModelAndView paddimpl(ModelAndView mv,
			Product product) {
		String imgname = product.getMf().getOriginalFilename();
		product.setImgname(imgname);	
		try {
			biz.register(product);
			Util.saveFile(product.getMf());
			mv.addObject("center", "registerok");
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/productlist.mc")
	public ModelAndView plist(ModelAndView mv,
			HttpServletRequest request) {
		ArrayList<Product> list = null;
		try {
			list = biz.get();
			request.setAttribute("plist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("center", "product/list");
		mv.addObject("navi", Navi.productlist);
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/productdetail.mc")
	public ModelAndView pdetail(ModelAndView mv, Integer id) {
		Product product =null;
		try {
			product= biz.get(id);
			mv.addObject("productdetail", product);
			mv.addObject("center", "product/detail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/productdelete.mc")
	public String pdelete(ModelAndView mv, Integer id) {
		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:productlist.mc"; // redirect
	}
	
	@RequestMapping("/productupdate.mc")
	public ModelAndView pupdate(ModelAndView mv, Integer id) {
	Product product = null;
		try {
			product = biz.get(id);
			mv.addObject("productupdate", product);
			mv.addObject("center", "product/update");
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		return mv;
	}

	@RequestMapping("/productupdateimpl.mc")
	public String pupdateimpl(Product product) {	
		try {
			biz.modify(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:productdetail.mc?id="+product.getId();
	}
}
