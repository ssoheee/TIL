package com.sds;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 자동적으로 이 부분이 실행됨
		System.out.println("LoginServlet Called..");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		if (id.equals("aaa") && pwd.equals("111")) {
			response.sendRedirect("loginok.html");
		} else {
			response.sendRedirect("loginfail.html");
		}
	}
}
