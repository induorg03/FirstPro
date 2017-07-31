package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.vo.UserBean;

/**
 * Servlet implementation class UserLogin
 */
//@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		//RequestDispatcher rd=request.getRequestDispatcher("LoginPage.html");
		String userId = request.getParameter("userId");	
		 String password = request.getParameter("password");
		 if(userId!=" "|| password!= " ")
			{
		 UserBean user=new UserBean(userId,password);
		 UserDao dao = new UserDao();
		 boolean result = dao.checkUser(user);
		
		 if(result == true)
			pw.println("Login Success");
		else
			 {
				 pw.println("Login UnSuccess");
				
	
				 
				 pw.println("<a href='http://localhost:2525/UserLogin/LoginPage.html'> Home</a>");
				 
			 }
			}
		 else
			 pw.println("Enter coorect information:");
			 
			 
	
		 }
	}


