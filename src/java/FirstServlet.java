

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
       String user = request.getParameter("uname");
       String pass = request.getParameter("pass");
       String path = "/URLrewriting/SecondServlet?uname="+user+"&pass="+pass;
       
       PrintWriter pw = response.getWriter();
       pw.println("<html><body>");
       pw.println("Welcome: "+user+"</br>");
       pw.println("Password: "+pass+"</br>");
       pw.println("<a href=\""+path+"\">click</a>");
       pw.println("</body></html>");
       
    }

   

}
