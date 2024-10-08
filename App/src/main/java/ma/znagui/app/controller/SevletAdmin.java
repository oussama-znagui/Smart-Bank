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
import java.util.List;

@WebServlet(name = "SevletAdmin" ,value = "/admin")
public class SevletAdmin  extends HttpServlet {
    private static RequestService requestService = new RequestServiceImp();


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Request> requests = requestService.getRequests();
        request.setAttribute("requests", requests);

        String path = "/WEB-INF/views/admin.jsp";
        this.getServletContext().getRequestDispatcher(path).forward(request, response);
    }

}

