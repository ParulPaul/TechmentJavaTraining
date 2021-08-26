package com.techment.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		out.println("This is cart page");
		
		Cookie myCookies[]= request.getCookies();
		
		for(int i=0;i<myCookies.length;i++) {
			
			out.print(myCookies[i].getName() +" "+ myCookies[i].getValue());
		}
	}

}
