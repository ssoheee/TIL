package com.sds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/HelloServlet", "/hello" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet Start...");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println(id+" "+pwd);
		
		// HTML5
		// response.sendRedirect("ok.jsp?id="+id); -> 가능하지만 잘 쓰진 않는 방법
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);list.add(3);list.add(8);
		
		ArrayList<Item> list2 = new ArrayList<Item>();
		list2.add(new Item("k1",1000));
		list2.add(new Item("k2",2000));
		list2.add(new Item("k3",3000));
		list2.add(new Item("k4",4000));
		list2.add(new Item("k5",5000));
		request.setAttribute("list1", list); 
		request.setAttribute("list2", list2); 
		request.setAttribute("id", id); // 키 값을 넣어 보내주는것
		request.setAttribute("cnt", 10); // 키 값을 넣어 보내주는것
		RequestDispatcher rd = request.getRequestDispatcher("ok.jsp");
		rd.forward(request,response);
		
		/* response.setContentType("text/html;charset=UTF-8");
		 * response.setCharacterEncoding("UTF-8"); 
		 * PrintWriter out = response.getWriter(); 
		 * out.println("<H1>LOGIN OK</H1>");
		 * out.println("<H1>"+id+"님 환영합니다.</H1>"); out.close();
		 */
	}

}
