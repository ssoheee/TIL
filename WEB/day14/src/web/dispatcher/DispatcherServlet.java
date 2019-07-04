package web.dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/DispatcherServlet", "/dispatcher" })
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DispatcherServlet() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));

		path = path.substring(1, path.lastIndexOf("."));
		String next = "main.jsp";
		if (path.equals("main")) {
			String view = request.getParameter("view");
			if (view != null) {
				UI.build(request, view); // 이렇게 가져오기 위해 UI에서 퍼블릭 스태틱으로 선언
			}
			next = "main.jsp";
		} else {
			next = path; // user 또는 product를 의미
		}
		RequestDispatcher rd = request.getRequestDispatcher(next);
		rd.forward(request, response);
	}
}