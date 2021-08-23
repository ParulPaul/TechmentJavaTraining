package com.techment.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());

	PrintWriter pw= response.getWriter();
	pw.print("<br>======calculation=====<br>");
	
	
	String whichCalculation=request.getParameter("calculation");
	
	if(whichCalculation.equalsIgnoreCase("ADD")) {
 		String n1= request.getParameter("n1");
	 	int num1= 	Integer.parseInt(n1);
	 	int num2 = Integer.parseInt(request.getParameter("n2"));
	 	
	 	int add=num1+num2;
	 	pw.println("Result of addition is: "+add);
 	}
	else if(whichCalculation.equalsIgnoreCase("SUB")) 
	{
		
		String n1=request.getParameter("n1");
		int num1=Integer.parseInt(n1);
		
		int num2=Integer.parseInt(request.getParameter("n2"));
		
		int sub=num1+num2;
		pw.println("Result of Substraction" +sub);
		
	}
	
	else if(whichCalculation.equalsIgnoreCase("MUL")) 
	{
		
		String n1=request.getParameter("n1");
		int num1=Integer.parseInt(n1);
		
		int num2=Integer.parseInt(request.getParameter("n2"));
		
		int mul=num1*num2;
		pw.println("Result of Multiplication" +mul);
		
	}
	else if(whichCalculation.equalsIgnoreCase("DIVIDE")) 
	{
		
		String n1=request.getParameter("n1");
		int num1=Integer.parseInt(n1);
		
		int num2=Integer.parseInt(request.getParameter("n2"));
		
		int divide=num1/num2;
		pw.println("Result of Divison" +divide);
		
	}
	
	
	
	
	
	
	
	
	}

}
