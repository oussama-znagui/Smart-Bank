package ma.znagui.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.znagui.app.model.Request;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "ServletSimulator", value = "/demande")
public class ServletSimulator extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/simulator.jsp").forward(request, response);


    }



    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Request myrequest = new Request();
        String project = request.getParameter("project");
        String pro = request.getParameter("pro");
        double amount = Double.parseDouble(request.getParameter("amount"));
        double duration = Double.parseDouble(request.getParameter("duration"));
        double mouthly = Double.parseDouble(request.getParameter("mouthly"));
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");
        String civility  = request.getParameter("civility");
        String lastName = request.getParameter("lastName");
        String firstName = request.getParameter("firstName");
        String cin = request.getParameter("cin");
        LocalDate bdate = LocalDate.parse(request.getParameter("bdate"));
        double revenu = Double.parseDouble(request.getParameter("revenu"));
        boolean credit = Boolean.parseBoolean(request.getParameter("credit"));

        




    }

}
