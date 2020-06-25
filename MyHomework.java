package hw5;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/MyHomework")
public class MyHomework extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyHomework() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<!DOCTYPE html><html lang=en>"+"<head><title>Servlet Table</title></head>"+
		"<body><table border=1><caption>Table</caption>");
		for(int i=1;i<=25;i++)
		{
			out.print("<tr><td>Row"+i+",Col1</td>");
			for(int y=2;y<=10;y++) {
				out.println("<td>Row"+i+",Col"+y+"</td>");
			}
			out.println("</tr>");
		}
		out.println("</table></body>");
	}

	
	

}
