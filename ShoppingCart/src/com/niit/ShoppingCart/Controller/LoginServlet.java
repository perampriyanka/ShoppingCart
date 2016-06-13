package com.niit.ShoppingCart.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.ShoppingCart.DAO.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String userid= (String) request.getParameter("userid");
       String password = (String) request.getParameter("password");
       
       UserDAO userDAO = new UserDAO();
       
       if(userDAO.isValidCredentials(userid,password)==true)
       {
    	   RequestDispatcher dispatcher =request.getRequestDispatcher("New.html"); 
            dispatcher.forward(request, response);
    	       
       }
       else
       {
    	   PrintWriter out=response.getWriter();
    	   out.print("Invalid Credentials");
    	   RequestDispatcher dispatcher =request.getRequestDispatcher("Login.html"); 
    	   dispatcher.include(request,response);
	  //dispatcher.forward(request,response);
		//dispatcher.include(request,response);
    	   
       }
       
       
       
       
    
	}

}

