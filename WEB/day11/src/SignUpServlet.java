

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet({ "/SignUpServlet", "/signup" })
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// elements check
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String result= "1";
		if (id.contentEquals("sohee")||id.contentEquals("sophie")) {
			result="0";
		} 
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}

	// 회원가입
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String pwd2 = request.getParameter("pwd2");
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		System.out.println(id + " " + name + " " + mail);		
		System.out.println("SignUpServlet Called..");
		String result= "1";
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}

}
