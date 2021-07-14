/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ListFilm;
import dal.SeatDAO;
import dal.ShowDAO;
import dal.TicketDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Film;
import model.Seat;
import model.Showing;
import model.Ticket;

/**
 *
 * @author Admin
 */

public class SeatControl extends HttpServlet {

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
            out.println("<title>Servlet SeatControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SeatControl at " + request.getContextPath() + "</h1>");
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
        String raw_filmID = request.getParameter("filmID");
        String showID = request.getParameter("showID");
        
        try {
            int filmID = Integer.parseInt(raw_filmID);
            Film film = new ListFilm().getFilmByID(filmID);
            List<Showing> show = new ShowDAO().getShowingByFilm(filmID);
            request.setAttribute("show", show);
            if(showID!=null&&!showID.equals("")){
                request.setAttribute("showData", new ShowDAO().getShowByID(showID));
                List<Ticket> t = new TicketDAO().getTicketByShow(showID);
                request.setAttribute("ticket", t);
            }
//                System.out.println(film);
           
            request.setAttribute("film", film);
            request.getRequestDispatcher("movie-seat-plan.jsp").forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(SeatControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
