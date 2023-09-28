package com.lcpan.m04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetClientInfo")
public class GetClientInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String html = "<html><head><title>Client Information Demo</title></head>"
				+ "<body><h2>Client資訊</h2>"
				+ "Scheme : " + request.getScheme() + "<br>"
				+ "ServerName : " + request.getServerName() + "<br>"
				+ "ServerPort : " + request.getServerPort() + "<br>"
				+ "ContextPath : " + request.getContextPath() + "<br>"
				+ "ServletPath : " + request.getServletPath() + "<br>"
				+ "Method : " + request.getMethod() + "<br>"
				+ "Protocol : " + request.getProtocol() + "<br>"
				+ "URI : " + request.getRequestURI() + "<br>"
				+ "</body></html>";
		out.write(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
