package com.web.sinobest.myfirmaven;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	    
	   
	    private static final long serialVersionUID = 6833688147345340845L;

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
	        PrintWriter out = response.getWriter();
	        out.print("first servlet");
	        out.flush();
	        out.close();
	        
	    }
}
