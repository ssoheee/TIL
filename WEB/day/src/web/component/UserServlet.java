package web.component;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.frame.Biz;
import com.user.UserBiz;
import com.vo.User;

@WebServlet({ "/UserServlet", "/user" })
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Biz<String, User> biz;

	public UserServlet() {
		biz = new UserBiz();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String view = request.getParameter("view");
		String cmd = request.getParameter("cmd");
		String next = "index.jsp";

		if (view != null) {
			UI.build(request, view);
		} else if (cmd != null) {
			if (cmd.equals("userlist")) {
				ArrayList<User> list = null;
				try {
					list = biz.get();
					request.setAttribute("ulist", list);
					UI.build(request, cmd);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if (cmd.equals("addimpl")) {
				String id = request.getParameter("val-userid");
				String pwd = request.getParameter("val-password");
				String name = request.getParameter("val-username");
				try {
					biz.register(new User(id, pwd, name));
					request.setAttribute("rid", id);
					UI.build(request, cmd);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if (cmd.equals("userdetail")) {
				String id = request.getParameter("id");
				User user = null;
				try {
					user = biz.get(id);
					request.setAttribute("ud", user);
					UI.build(request, cmd);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if (cmd.equals("delete")) {
				String id = request.getParameter("id");
				try {
					biz.remove(id);
					response.sendRedirect("user.do?cmd=userlist");
					return;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if (cmd.equals("userupdate")) {
				String id = request.getParameter("id");
				User user = null;
				try {
					user = biz.get(id);
					request.setAttribute("uu", user);
					UI.build(request, cmd);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (cmd.equals("updateimpl")) {
				String id = request.getParameter("val-userid");
				String pwd = request.getParameter("val-password");
				String name = request.getParameter("val-username");
				try {
					biz.modify(new User(id, name, pwd));
					UI.build(request, cmd);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} 
		
		RequestDispatcher rd = request.getRequestDispatcher(next);
		rd.forward(request, response);
	}

}
