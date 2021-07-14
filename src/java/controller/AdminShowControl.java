/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ListFilm;
import dal.ShowDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Film;
import model.Showing;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AdminShowControl", urlPatterns = {"/admin-showControl"})
public class AdminShowControl extends HttpServlet {

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
            out.println("<title>Servlet AdminShowControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminShowControl at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String type = request.getParameter("type");
        switch(type){
            case "0":
                request.getRequestDispatcher("admin-show.jsp").forward(request, response);
                break;
            case "1":
                Showing s = new ShowDAO().getShowByID(request.getParameter("id"));
        {
            try {
                Film f = new ListFilm().getFilmByID(s.getFilm_id());
                request.setAttribute("film", f);
            } catch (ParseException ex) {
                Logger.getLogger(AdminShowControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
                request.setAttribute("show", s);
                request.getRequestDispatcher("admin-show-edit.jsp").forward(request, response);
        }
        ;
//        processRequest(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String room = request.getParameter("room");
        String time = request.getParameter("time");
        Showing s = new Showing();
        s.setId(Integer.parseInt(id));
        s.setRoom_id(Integer.parseInt(room));
        s.setTime(time);
        ShowDAO sDAO = new ShowDAO();
        sDAO.updateShow(s);
        request.getRequestDispatcher("admin-show.jsp").forward(request, response);
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
