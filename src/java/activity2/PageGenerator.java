/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mitchell
 */
@WebServlet(name = "PageGenerator", urlPatterns = {"/Pager"})
public class PageGenerator extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>PageGenerator</title>"); 
            out.println("<link rel='stylesheet' href='styles.css' type='text/css'>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>" +"Employee Age And Job Title"+"</h1>");
            
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>Name</th>");
            out.println("<th>Age</th>");
            out.println("<th>Job Title</th>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Bob F.</td>");
            out.println("<td>34</td>");
            out.println("<td>Project Manager</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Amy G.</td>");
            out.println("<td>42</td>");
            out.println("<td>Designer</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Kyle K</td>");
            out.println("<td>22</td>");
            out.println("<td>Programmer</td>");
            out.println("</tr>");
            
            out.println("</table>");
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
