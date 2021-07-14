/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ListFilm;
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

/**
 *
 * @author Admin
 */
@WebServlet(name = "FilmController", urlPatterns = {"/admin-filmControl"})
public class FilmController extends HttpServlet {
    ListFilm list = new ListFilm();
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
            out.println("<title>Servlet FilmController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FilmController at " + request.getContextPath() + "</h1>");
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
        String type = request.getParameter("type");
        switch(type){
            case "1":
                try {
                    Film f = list.getFilmByID(Integer.parseInt(request.getParameter("id")));
                    request.setAttribute("f", f);    
                    request.getRequestDispatcher("admin_film_edit.jsp").forward(request, response);
                } catch (ParseException ex) {
                    Logger.getLogger(FilmController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                break;
            case "0":
                request.getRequestDispatcher("admin_film.jsp").forward(request, response);
                break;
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String image = request.getParameter("image");
        String date_release = request.getParameter("date_release");
        String film_start_date = request.getParameter("film_start_date");
        String film_end_date = request.getParameter("film_end_date");
        Integer duration = Integer.parseInt(request.getParameter("duration"));
        String description = request.getParameter("description");
        String trailer = request.getParameter("trailer");
        Film f = new Film(id, name, image, date_release, film_start_date, film_end_date, duration, description, trailer);
        ListFilm lf = new ListFilm();
        lf.updateFilm(f);
//        System.out.println(f.getName()+"    "+f.getDate_release());
        request.getRequestDispatcher("admin_film.jsp").forward(request, response);
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
