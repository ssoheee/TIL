package mini.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HiveController {
	
	
	@RequestMapping("/chart.mc")
	public ModelAndView chart(ModelAndView mv) throws Exception{
		Class.forName("org.apache.hive.jdbc.HiveDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:hive2://70.12.114.223:10000/default", "root", "111111");
		JSONArray prolist = new JSONArray();
		JSONArray prolist2 = new JSONArray();
		Statement stmt = conn.createStatement();
		Statement stmt2 = conn.createStatement();
		JSONObject data = new JSONObject();
		JSONObject data2 = new JSONObject();
		ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUCT_VISIT  ");
		ResultSet rs2 = stmt2.executeQuery("SELECT productno,count(*) FROM PRODUCT_VISIT group by productno");
		
		String num ="";
		
		while (rs2.next()) {
			for(int i=1; i<2; i++) {
			 System.out.printf(rs2.getString(i)+ " ");
			 // data = new JSONObject();
			 data2 = new JSONObject();
				/*
				 * data.put("ProductNo",rs.getString(8)); data.put("month",rs.getString(2));
				 */
			 
			 data2.put("ProductNo",rs2.getString(1));
			 data2.put("Count",rs2.getString(2));			 
			}

			prolist2.add(data2);	
			System.out.println();
		}
		
		conn.close();

		System.out.println(prolist2);
		System.out.println("Success....");
		mv.addObject("center","hive/char");
		mv.addObject("json",prolist2);
		mv.setViewName("main");
		return mv;
	}
}
