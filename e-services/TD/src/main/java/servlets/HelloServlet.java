package servlets;

import beans.HelloBean;
import beans.HelloEJB;
import beans.HelloEJBLocal;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Vector;

public class HelloServlet extends HttpServlet {

    @EJB
    HelloEJBLocal helloEJBLocal;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        // Creat a request session
//        HttpSession session = request.getSession(true);
//        String nom = request.getParameter("nom");
//
//        //Collection
//        Collection<HelloBean> listHello = new Vector<>();
//        for (int i = 0; i < 10; i++) {
//            HelloBean bean = new HelloBean();
//            bean.setNom(nom + " " + i);
//            listHello.add(bean);
//        }
//        // add collection to session
//        session.setAttribute("beanHello", listHello);
//
//        response.sendRedirect("HelloBeanSession.jsp");
//
//        System.out.println("Je continue à travailler : " + nom);
//    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ouiiii");
        PrintWriter pw = resp.getWriter();
        helloEJBLocal.saveHello("ayoub");
        System.out.println(helloEJBLocal.direBonjourEntity("ayoub"));
        pw.println(helloEJBLocal.direBonjour("ayoub"));
    }
}
