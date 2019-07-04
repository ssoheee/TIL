package web.component;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.frame.Biz;
import com.user.UserBiz;
import com.vo.User;

@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Biz<String, User> biz;

	public LoginServlet() {
		biz = new UserBiz();
	}

	// logout 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session!=null) {
			session.invalidate();
		}
		response.sendRedirect("main.jsp");
	}

	// login 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String center = "";
		User user = null;
		try {
			user = biz.get(id);
			if (user.getPwd().equals(pwd)) {
				center = "loginok";
				HttpSession session = request.getSession(); // 서버에 로그인 세션을 만듦
				// session.setMaxInactiveInterval(interval); 일정시간 지나면 로그아웃
				session.setAttribute("loginuser", user);
			} else {
				center = "loginfail";
			}

		} catch (Exception e) {
			center = "loginfail";
			e.printStackTrace();
		}
		request.setAttribute("center", center);
		RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
		rd.forward(request, response);
	}
}
