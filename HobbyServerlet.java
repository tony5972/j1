/*Assignment No:5 Set B.2
Name:
Roll No:
Program:*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HobbyServerlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
	{
		String data=req.getParameter("hobby");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		Cookie []c=req.getCookies();	
		out.println("<html><body>");
		if(c!=null)
		{
			out.println("<h3>Existing cookie:</h3><br>");
			for(int i=0;i<c.length;i++)
			{
				String name=c[i].getName();
				String value=c[i].getValue();
				out.println(""+name);
				out.println(""+value);
			}
			for(int i=0;i<c.length;i++)
			{
				if(c[i].getValue().equals(data))
				{
					out.println("<h3>cookie is exist</h3>");
					return;
				}
			}
		}
		else
		{
			Cookie c1=new Cookie("hobby",data);
			
			resp.addCookie(c1);
			out.println("<h4>Cookie is added</h4><h2>"+data);
			out.println("</h2>");
		}out.println("</body></html>");
	}
}
