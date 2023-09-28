package com.lcpan.m04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetParam")
public class GetParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetParam() {
		super();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String html = "<html><body><h3>Hello " + username + ", 你好</h3><h3>Your age: " + age + "</h3></body></html>";
		out.print(html);
		
		
		
//		response.getWriter().append("<html><body><h3>Hello ").append(username).append(", 你好</h3><h3>Your age: ").append(age).append("</h3></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
