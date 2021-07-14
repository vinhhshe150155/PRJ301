/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ListFilm;
import dal.SeatDAO;
import dal.ShowDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Film;
import model.Showing;
import model.Ticket;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ShowDetailsControl", urlPatterns = {"/admin-showDetail"})
public class ShowDetailsControl extends HttpServlet {

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
            out.println("<title>Servlet ShowDetailsControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowDetailsControl at " + request.getContextPath() + "</h1>");
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
        Integer id = Integer.parseInt(request.getParameter("id"));
        ShowDAO s = new ShowDAO();
        List<Ticket> t = s.getAllTicketLeft(id);
        Showing show = s.getShowByID(Integer.toString(id));
        System.out.println(show.getFilm_id());
        String str="";
        for(Ticket tk:t){
            str+=new SeatDAO().getSeatById(tk.getSeat_id())+", ";
        }
        if(!str.equals("")&&str.length()>3){
            str = str.substring(0, str.length()-2);
        }
        Film f;
        try {
            f = new ListFilm().getFilmByID(show.getFilm_id());
            request.setAttribute("film", f);
        } catch (ParseException ex) {
            Logger.getLogger(ShowDetailsControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("tk", str);
        request.setAttribute("show", show);
        request.setAttribute("ticket", t);
        request.getRequestDispatcher("admin-show-detail.jsp").forward(request, response);
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
