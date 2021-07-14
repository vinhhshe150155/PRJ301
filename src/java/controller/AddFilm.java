/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ListFilm;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AddFilm", urlPatterns = {"/AddFilm"})
public class AddFilm extends HttpServlet {
    ListFilm l = new ListFilm();
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
            out.println("<title>Servlet AddFilm</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddFilm at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher(request.getParameter("type").equals("2")?"admin_film_add.jsp":"admin_film.jsp").forward(request, response);
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
        String name = request.getParameter("name");
        String img = request.getParameter("image");
        String date_release = request.getParameter("date_release");
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        String duration = request.getParameter("duration");
        String des = request.getParameter("des");
        String trailer = request.getParameter("trailer");
        try{
            Film f = new Film();
            f.setName(name);
            f.setFilm_image(img);
            f.setDate_release(date_release);
            f.setFilm_start_date(start);
            f.setFilm_end_date(end);
            f.setDuration(Integer.parseInt(duration));
            f.setFilm_description(des);
            f.setTrailer(trailer);
            l.insertFilm(f);
            
        }catch(NumberFormatException e){
            System.out.println(e);
        }finally{
            request.getRequestDispatcher("admin_film.jsp").forward(request, response);
        }
        
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
