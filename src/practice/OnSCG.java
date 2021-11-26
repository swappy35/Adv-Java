package practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OnSCG extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		ServletConfig conf = getServletConfig();
		String s1 = conf.getInitParameter("n1");
		String s2 = conf.getInitParameter("n2");
		int i = Integer.parseInt(s1);		
		int j = Integer.parseInt(s2);
		out.println("n1 value: " +s1+ "<br>n2 value: " +s2);
		out.println("<br>Sum of "+s1+" & "+s2+" : "+(i+j));
		out.close();
	}
}
