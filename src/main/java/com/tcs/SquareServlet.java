package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SquareServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		
		int k=(int)request.getAttribute("k");
		
		//k=k*k;
		PrintWriter out=response.getWriter();
		
		out.println("Result is : "+k);
	}
}
