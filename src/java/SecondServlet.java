/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author A2A Town
 */
public class SecondServlet extends HttpServlet {

   

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("uname");
        String pass = request.getParameter("pass");
        PrintWriter pw = response.getWriter();
        if(user.equals("reach")&&pass.equals("123"))
        {
            pw.println("Login succesfully");
        }
        else
        {
            pw.println("Incorrect username or password!");
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
}
