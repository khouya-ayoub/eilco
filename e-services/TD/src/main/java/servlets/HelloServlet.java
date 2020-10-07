package servlets;

import beans.HelloBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        HelloBean bean = new HelloBean();
        bean.setNom(nom);
        request.setAttribute("beanHello", bean);
        request.getRequestDispatcher("").forward(request, response);
        System.out.println("Je continue à travailler : " + nom);
    }
}
