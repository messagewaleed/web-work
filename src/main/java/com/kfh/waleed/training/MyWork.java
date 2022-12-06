package com.kfh.waleed.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/my", initParams = {@WebInitParam(name = "jdbcDriver", value = "com.mysql.cj.jdbc.Driver")})
public class MyWork extends HttpServlet {
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig();
		
		String driver = config.getInitParameter("jdbcDriver");
		
		out.println("Driver for MySQL is : " + driver);
		
		out.println("<br>Servlet name : " + config.getServletName());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
