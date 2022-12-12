package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Account;

import java.io.IOException;

@WebServlet(name = "LogInServlet", value = "/LogInServlet")
public class LogInServlet extends HttpServlet {
    Account admin = new Account("admin", "admin");
    Account adminTwo = new Account("admin2", "admin2");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("loggedin") != null) {
            getServletContext().getRequestDispatcher("/view/loggedIn.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession userSession;

        if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
            userSession = request.getSession();
            userSession.setAttribute("loggedin", new Account(username, password));
            doGet(request, response);
        } else if (username.equals(adminTwo.getUsername()) && password.equals(adminTwo.getPassword())) {
            userSession = request.getSession();
            userSession.setAttribute("loggedin", new Account(username, password));
            doGet(request, response);
        } else {
            request.setAttribute("error", "Sorry, username and password was incorrect!");
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }
}
