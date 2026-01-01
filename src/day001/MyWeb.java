package day001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyWeb implements Servlet{

	ServletConfig con=null ;
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {

		this.con=con;
		con = arg0;
		System.out.println("config");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       res.setContentType("text/html");	
       PrintWriter out=res.getWriter();
       out.print("<html><body>");
       out.print("<h1>hello this is my first servlet <h1>");
       out.print("<h2> i am pranit <h2>");
       out.print("<h3> restart <h3>");

       out.print("</html></body>");

	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return con;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
