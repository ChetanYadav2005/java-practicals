package pack1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String str1=request.getParameter("txt1");
        
        HttpSession session=request.getSession();
        session.setAttribute("name",str1);

        out.print("<form action='Login'>");
        out.print("<input type='submit' value='go'>");
        out.print("</form>");
    }
}
