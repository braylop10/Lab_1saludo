package com.lab_1.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EDISON
 */
@WebServlet(name = "CalcularServlet", urlPatterns = {"/CalcularServlet"})
public class CalcularServlet extends HttpServlet {

   

    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
               
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        LocalTime horaActual = LocalTime.now();
        
        if (horaActual.getHour() >= 12 && horaActual.getHour() <=18 ) {
            apellido= apellido+ "   buenas tardes";
           
           
        }else if (horaActual.getHour() >= 18 && horaActual.getHour() <=24 ) {
            apellido= apellido+ "   buenas noches";
        }else if(horaActual.getHour() >= 0 && horaActual.getHour() <=12 ){
            apellido= apellido+ "   buenos dias";
        }
        int actual;
        actual = Integer.parseInt(request.getParameter("actual"));
        int nacimiento;
        nacimiento = Integer.parseInt(request.getParameter("nacimiento"));
        


        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcularServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Hola XD "+ "</h1>");
            out.println("<h1> " + nombre +" "+ apellido + "</h1>");
            out.println("<h1> Su edad es: "  +(actual-nacimiento)+ "años! </h1>");        
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
