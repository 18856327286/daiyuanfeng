package dyf.com.webapp;

import jakarta.servlet.annotation.WebServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


import java.io.IOException;


@WebServlet(name = "Servlet", value = "/Servlet")
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("good luck");
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String userage = request.getParameter("userage");
        System.out.println(username + " " + userage + "luck");
    }
}
