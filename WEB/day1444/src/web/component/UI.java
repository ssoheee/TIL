package web.component;

import javax.servlet.http.HttpServletRequest;

public class UI {
	public static void build(HttpServletRequest request, String view) {
		if (view.equals("login")) {
			request.setAttribute("center", "login"); // center에 login이 들어간다
		} else if (view.equals("register")) {
			request.setAttribute("center", "register");
		}
		else if (view.equals("aboutus")) {
			request.setAttribute("center", "aboutus");
		}
		else if (view.equals("useradd")) {
			request.setAttribute("center", "user/add");
		}
		else if (view.equals("userlist")) {
			request.setAttribute("center", "user/list");
		}
		else if (view.equals("productadd")) {
			request.setAttribute("center", "product/add");
		}
		else if (view.equals("productlist")) {
			request.setAttribute("center", "product/list");
		}
	}
}
