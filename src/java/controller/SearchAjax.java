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
import java.util.List;
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
@WebServlet(name = "SearchAjax", urlPatterns = {"/SearchAjax"})
public class SearchAjax extends HttpServlet {

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
            out.println("<title>Servlet SearchAjax</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchAjax at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        try {
         
            List<Film> l = new ListFilm().getFilmByName(name);
            if(l==null){
                out.println("<h1>Not found<h1>");
            }else{
                out.println("<ul>");
                l.forEach((f) -> {
                    out.println("<li style=\"margin: 0; padding: 0; display: flex\">"
                            + "<div>"
                                + "<img style=\"height: 22px; width: 18px\" src=\""+f.getFilm_image()+"\">"
                            + "</div>");
                    out.println("<div>"
                            + "<a href=\"film-detail?filmID="+f.getFilmID()+"\" style=\"margin-left: 4px; height: 100%; \">"
                        + "<p style=\"text-overflow: ellipsis;overflow: hidden;white-space: nowrap;\">"+capitalizeWord(f.getName())+"</p></a></div>");
                    out.println("<hr style=\"margin: 0\">");
                    out.println("</li>");
                    });
                    out.println("</ul>");                
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(SearchAjax.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String capitalizeWord(String str){  
    String words[]=str.split("\\s");  
    String capitalizeWord="";  
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
    }  
    return capitalizeWord.trim();  
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
