package servlet;

import service.Calculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcServlet extends HttpServlet {

    private final Calculator calc;

    public CalcServlet(Calculator calc) {
        this.calc = calc;
    }


    /**
     * http://localhost:8080/calc?a=5&b=6
     * Map<String, String[]> parameterMap = req.getParameterMap();
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String str = "<h1>Calc Servlet</h1>";
        String a = req.getParameter("a");
        String b = req.getParameter("b");
        String c = req.getParameter("c");

        try (PrintWriter w = resp.getWriter()) {
            w.println(a);
            w.println(b);
            w.println(c);
            w.println(str);

        }
    }
}
