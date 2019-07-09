package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.vo.User;

@Controller
public class UserController {

	@Resource(name = "ubiz")
	Biz<String, User> biz;

	@RequestMapping("/useradd.mc")
	public ModelAndView uadd() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("center", "user/add");
		mv.addObject("navi", Navi.useradd);
		mv.setViewName("main");
		return mv;
	}

	@RequestMapping("/useraddimpl.mc")
	public ModelAndView uaddimpl(ModelAndView mv, 
			User user) {
		System.out.println(user);
		try {
			biz.register(user);
			mv.addObject("center", "registerok");
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		return mv;
	}

	@RequestMapping("/userlist.mc")
	public ModelAndView ulist(ModelAndView mv,
			HttpServletRequest request) {
		ArrayList<User> list = null;
		try {
			list = biz.get();
			request.setAttribute("ulist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("center", "user/list");
		mv.addObject("navi", Navi.userlist);
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/userdetail.mc")
	public ModelAndView udetail(ModelAndView mv, String id) {
		User user =null;
		try {
			user = biz.get(id);
			mv.addObject("userdetail", user);
			mv.addObject("center", "user/detail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/userdelete.mc")
	public String udelete(ModelAndView mv, String id) {
		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:userlist.mc"; // redirect
	}
	
	@RequestMapping("/userupdate.mc")
	public ModelAndView uupdate(ModelAndView mv, String id) {
		User user =null;
		try {
			user = biz.get(id);
			mv.addObject("userupdate", user);
			mv.addObject("center", "user/update");
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		return mv;
	}

	@RequestMapping("/userupdateimpl.mc")
	public String uupdateimpl(User user) {	
		try {
			biz.modify(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:userdetail.mc?id="+user.getId();
	}
}
