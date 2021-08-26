package com.techment.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LaptopPrice")
public class LaptopPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		int price=70000;
		PrintWriter pw= response.getWriter();
		
		int quantity =Integer.parseInt(request.getParameter("laptop"));
		pw.print("you have selected" +quantity);
		
		
	    int totalPrice= quantity*price;
		pw.print("Total Price" +totalPrice);
		
		
		pw.print("<a href ='Cart'>go to cart</a>");
		
		String toPrice= String.valueOf(totalPrice);
		Cookie cookie = new Cookie("laptop_price", toPrice);	
		response.addCookie(cookie);
		
	}

	
	

}
