package pack1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Login extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        HttpSession session=request.getSession(false);
        if(session!=null)
        {
            String name=(String)session.getAttribute("name");

            out.print("Hello, "+name+" Welcome to the world of Servlet");
        }
    }
}
