package servlet;

import service.Calculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

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

        String str = "Calc Servlet";

        Optional<Integer> a = Optional.ofNullable(req.getParameter("a"))
                .map(Integer::parseInt);
        Optional<Integer> b = Optional.ofNullable(req.getParameter("b"))
                .map(Integer::parseInt);
        Optional<Integer> c = Optional.ofNullable(req.getParameter("c"))
                .map(Integer::parseInt);

        Optional<String> ab = a.flatMap((Integer ai) -> b.map((Integer bi) -> ai + bi))
                .map(String::valueOf);

        Optional<String> ac = a.flatMap((Integer ai) -> c.map((Integer ci) -> ai + ci))
                .map(String::valueOf);

//        String a = req.getParameter("a");
//        String b = req.getParameter("b");
//        String c = req.getParameter("c");

        try (PrintWriter w = resp.getWriter()) {
            w.println(a);
            w.println(b);
            w.println(c);
            w.println(ab.orElse("No values"));
            w.println(ac.orElse("No values"));
            w.println(str);

        }
    }
}
