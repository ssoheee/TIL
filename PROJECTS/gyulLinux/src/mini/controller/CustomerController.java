package mini.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mini.vo.Customer;

@Controller
public class CustomerController {
	
	@RequestMapping("/login.mc")
	public ModelAndView login(HttpSession session) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("center","login");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/curegister.mc")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("center","register");
		mv.setViewName("main");
	
		return mv;
	}
	
	
	
}
