package com.sds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class HchartServlet
 */
@WebServlet({ "/HchartServlet", "/hchart" })
public class HchartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * [{ name: 'Tokyo', data: [7.0, 6.9, 9.5, 14.5, 18.4, 21.5, 25.2, 26.5, 23.3,
		 * 18.3, 13.9, 9.6] }, { name: 'London', data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2,
		 * 17.0, 16.6, 14.2, 10.3, 6.6, 4.8] }]
		 */
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		Random r = new Random();

		String datas[] = {"Seoul", "Busan", "Daegu"};
		JSONArray da = new JSONArray();
		
		for (int i=0; i<3; i++) {
			JSONObject d = new JSONObject();
			d.put("name", datas[i]);
			JSONArray dd = new JSONArray();
			for(int j=0; j<12; j++) {
			dd.add(r.nextInt(30)+1);}
			d.put("data", dd);
			da.add(d);

		}		
		
		out.print(da.toJSONString());
		out.close();
	}

}
