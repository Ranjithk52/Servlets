package com.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sq")
public class square extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int k=Integer.parseInt(req.getParameter("k"));
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("SQuare of Sum of numbers is: "+k);
		
		
		
	}
}
