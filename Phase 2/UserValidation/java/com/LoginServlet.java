package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String uname= req.getParameter("txtUname");
		String pword= req.getParameter("txtPassword");
		RequestDispatcher rd;
		if(uname.equalsIgnoreCase("user1") && pword.equals("admin@1")) {
		
			HttpSession session=req.getSession(true);
			session.setAttribute("username", uname);
			rd=req.getRequestDispatcher("dashboard");
			rd.forward(req, resp);
		}else {
			rd=req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			out.println("<center> <span style='color:red'>Invalid Username or Password");
			
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
	}
	
}
