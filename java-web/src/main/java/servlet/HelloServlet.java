package servlet;

import service.Calculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = "<h1>Hello world!!!</h1> <p>Lorem ipsum dolor</p>";
        try (PrintWriter w = resp.getWriter()) {
            w.println(str);
        }
    }
}
