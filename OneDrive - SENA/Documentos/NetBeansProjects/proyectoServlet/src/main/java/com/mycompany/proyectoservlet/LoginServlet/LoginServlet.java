/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.proyectoservlet.LoginServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            if ("admin".equals(username) && "1234".equals(password)) {
                out.println("<!DOCTYPE html>");
                out.println("<html lang=\"en\">");
                out.println("<head>");
                out.println("<meta charset=\"UTF-8\">");
                out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
                out.println("<title>Login Success</title>");
                out.println("<link rel=\"stylesheet\" href=\"https://unpkg.com/@picocss/pico@latest/css/pico.min.css\">");
                out.println("</head>");
                out.println("<body>");
                out.println("<main class=\"container\">");
                out.println("<h1>Login Successful</h1>");
                out.println("<p>Welcome, " + username + "!</p>");
                out.println("</main>");
                out.println("</body>");
                out.println("</html>");
            } else {
                out.println("<!DOCTYPE html>");
                out.println("<html lang=\"en\">");
                out.println("<head>");
                out.println("<meta charset=\"UTF-8\">");
                out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
                out.println("<title>Login Failed</title>");
                out.println("<link rel=\"stylesheet\" href=\"https://unpkg.com/@picocss/pico@latest/css/pico.min.css\">");
                out.println("</head>");
                out.println("<body>");
                out.println("<main class=\"container\">");
                out.println("<h1>Login Failed</h1>");
                out.println("<p>Invalid username or password. Please try again.</p>");
                out.println("</main>");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }
}



