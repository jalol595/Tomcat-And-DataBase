package uz.pdp;

import uz.pdp.controller.DbServis;
import uz.pdp.model.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String username = req.getParameter("username");
         String name = req.getParameter("name");
         String password = req.getParameter("password");
         String prepassword = req.getParameter("prepassword");
         PrintWriter printWriter = resp.getWriter();
        if(password.equals(prepassword)){
             DbServis dbServis = new DbServis();
             Users users = new Users();

             users.setUsername(username);
             users.setName(name);
             users.setPassword(password);

             dbServis.saveUser(users);
             resp.sendRedirect("/Cabinet");

         }
           printWriter.write("error");

    }
}
