
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/RegisterServlet", "/register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8"); 
		
		System.out.println("START");
		String r = request.getParameter("radio");
		String s = request.getParameter("select");
		String cs[]=request.getParameterValues("checkbox");
		
		System.out.println(r+" "+s+" "+Arrays.toString(cs));

		request.setAttribute("r", r); 
		request.setAttribute("s", s); 
		request.setAttribute("c", cs); 
		
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request,response);
		
	}

}
