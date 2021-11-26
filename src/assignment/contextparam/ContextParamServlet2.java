package assignment.contextparam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextParamServlet2 extends HttpServlet{
	protected void doPost(HttpServletRequest resquest, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		ServletContext context = getServletContext();
		ServletConfig confige = getServletConfig();
		
		String s1 = context.getInitParameter("a");
		String s2 = context.getInitParameter("b");
		String s3 = context.getInitParameter("c");
		String s4 = confige.getInitParameter("d");
		
		int i = Integer.parseInt(s1);		
		int j = Integer.parseInt(s2);
		int k = Integer.parseInt(s3);		
		int l = Integer.parseInt(s4);
		
		out.println("<br>Multiplication of "+s1+" and "+s4+" : "+(i*l));
		out.println("<br>Subtraction of "+s2+" from "+s3+" : "+(j-k));
		
		out.close();
	}
}
