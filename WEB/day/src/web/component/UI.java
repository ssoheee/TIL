package web.component;

import javax.servlet.http.HttpServletRequest;

public class UI {
	public static void build(HttpServletRequest request, String view) {
		if (view.equals("useradd")) {
			request.setAttribute("center", "user/add");
		} else if (view.equals("addimpl")) 
		{
			request.setAttribute("center", "user/rok");
		}
		else if (view.equals("userlist")) {
			request.setAttribute("center", "user/list");
		}
		else if (view.equals("userdetail")) {
			request.setAttribute("center", "user/detail");
		}
		else if (view.equals("userupdate")) {
			request.setAttribute("center", "user/update");
		}else if (view.equals("updateimpl")) 
		{
			request.setAttribute("center", "user/rok");
		}
	}
}
