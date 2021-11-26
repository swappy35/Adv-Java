package assignment.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

public class UserProfileFilter implements Filter{
	
	FilterConfig filterConfig = null;
	
	public void destroy() {
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		String S1 = request.getParameter("username");
		String S2 = request.getParameter("profileId");
		
		System.out.println(S1);
		System.out.println(S2);
		
		if(S1 != null){
		if(S1.equals("Admin")){
			out.print("Successfully entered Dash Board by User Name.<br><br>");
			chain.doFilter(request, response);
			out.print("<br>Admin");
		}
		else{    
			out.print("Wrong input, try again...<br><br>");
			RequestDispatcher rd=request.getRequestDispatcher("homefilter.html");  
			rd.include(request, response); 
	    } 
		}
		if(S2 != null){
		if(S2.equals("Admin123")){
			out.print("Successfully entered Dash Board by Profile ID.<br><br>");
			chain.doFilter(request, response);
			out.print("<br>Admin123");
		}
		else{     
			out.print("Wrong input, try again...<br><br>");
			RequestDispatcher rd=request.getRequestDispatcher("homefilter.html");  
			rd.include(request, response);  
			
	    } 
		}
	}
	public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;
	}
}
