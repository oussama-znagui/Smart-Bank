package ma.znagui.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.znagui.app.entities.Request;
import ma.znagui.app.service.RequestService;
import ma.znagui.app.service.imp.RequestServiceImp;


import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(name = "ServletSimulator", value = "/demande")
public class ServletSimulator extends HttpServlet {
    private int compteur;

    private static RequestService requestService = new RequestServiceImp();

    public void init() throws ServletException {
        compteur = 9;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        this.getServletContext().getRequestDispatcher("./index.jsp").forward(request, response);
//        response.setContentType("text/plain");
//        PrintWriter out = response.getWriter();
//        if(compteur > 0){
//            response.setHeader("Refresh", "1");
//            --compteur;
//            out.println(compteur + "....");
//
//        }else {
//            out.println("fin");
//        }
//
//
   }




    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      Request myrequest = new Request();
      myrequest.setProject(request.getParameter("project"));
      myrequest.setPro(request.getParameter("pro"));
      myrequest.setAmount(Double.parseDouble(request.getParameter("amount")));
      myrequest.setDuration(Integer.parseInt(request.getParameter("duration")));
      myrequest.setMountly(Double.parseDouble(request.getParameter("monthly")));
      myrequest.setEmail(request.getParameter("email"));
      myrequest.setPhone(request.getParameter("tel"));
      myrequest.setCivility(request.getParameter("civility"));
      myrequest.setLastName(request.getParameter("lastname"));
      myrequest.setFistName(request.getParameter("fistname"));
      myrequest.setCin(request.getParameter("cin"));
      myrequest.setBirthDay(LocalDate.parse(request.getParameter("b-date")));
      myrequest.setIncomes(Double.parseDouble(request.getParameter("revenu")));
      myrequest.setCurrentCredits(Boolean.parseBoolean(request.getParameter("credit")));

        requestService.createRequest(myrequest);

        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Simulator</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Simulator</h1>");
        out.println("<p>");
        out.println();
        out.println("</p>");
        out.println("</body>");
        out.println("</html>");

//        requestService.createRequest(myrequest);

    }






}

