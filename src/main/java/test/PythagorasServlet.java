package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PythagorasServlet
 */
@WebServlet("/PythagorasServlet")
public class PythagorasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PythagorasServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double c = calcPythagoras(a, b);
        request.setAttribute("a", a);
        request.setAttribute("b", b);
        request.setAttribute("c", c);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/calc_c.jsp");
        rd.forward(request,response);
    }

    public double calcPythagoras(double num1, double num2) {
        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
    }

}
