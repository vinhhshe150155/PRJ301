/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDAO;
import dal.ListFilm;
import dal.SearchDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Category;
import model.Film;

/**
 *
 * @author Admin
 */
@WebServlet(name = "FilmPage", urlPatterns = {"/films"})
public class FilmPage extends HttpServlet {

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
            out.println("<title>Servlet FilmPage</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FilmPage at " + request.getContextPath() + "</h1>");
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
//            int quantity = 12;
        String name = request.getParameter("name")==null?"":request.getParameter("name");
        String sort = request.getParameter("sort")==null?"":request.getParameter("sort");
//        System.out.println(name);
        ///insert search value to db
        if(name!=null&&!"".equals(name)){
            SearchDAO s = new SearchDAO();
            s.search(name);
        }
        try{
            List<Film> films;
            List<Category> c = new CategoryDAO().getAllCategory();
            String[] cates = cateChecked(request, response);//get checked value
            String[] lang = langChecked(request, response);
            ListFilm lf = new ListFilm();
            if(name.equals("")){
                films = lf.getFilmByCate(cates, lang);
            }else{
                films = lf.getFilmByName(name);
            }        
            switch(sort){
                case "1":
                    films = lf.getFilmShowToday();
                    break;
                case "2":
                    films = lf.getFilmByNameAsc(name);
                    break;
                case "3":
                    films = lf.getFilmMostView();
                    break;
                case "4":
                    films = lf.getFilmMostRate();
                    break;
                    
            }
            
            
            int size=films==null?0:films.size();
//            System.out.println(size);
            String raw_num = request.getParameter("show");  
            int numperPage=raw_num==null?7:Integer.parseInt(raw_num);
            int numPage=size/numperPage+(size%numperPage==0?0:1);   
            String npage=request.getParameter("page");
            int page;
            if(npage==null){
                page=1;
            }else{
                page=Integer.parseInt(npage);
            }
            int start,end;
            start=(page-1)*numperPage;
            end=Math.min(size,page*numperPage);
            List<Film> flist=new ListFilm().getFilmByPage(films, start, end);
            request.setAttribute("name", name);
//            HttpSession session = request.getSession();
//            Account customer =  (Account)session.getAttribute("account");
//            System.out.println("Home: "+customer.getEmail());
//if(customer==null){
//            response.sendRedirect("login");
////            System.out.println("UOA");
//        }
            request.setAttribute("langChecked", lang);
//            System.out.println("lang: "+lang.length);
            request.setAttribute("cateChecked", cates);
            request.setAttribute("num", numPage);
            request.setAttribute("films", flist);
            request.setAttribute("page", page);
//            System.out.println(flist.size());
            request.setAttribute("cate", c);
            request.getRequestDispatcher("movie-list.jsp").forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(FilmPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String[] cateChecked(HttpServletRequest req, HttpServletResponse res){
        String [] cateCheck = req.getParameterValues("cate");
        return cateCheck;
    }
    public String[] langChecked(HttpServletRequest req, HttpServletResponse res){
        String [] langCheck = req.getParameterValues("lang");
        return langCheck;
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
        doGet(request, response);
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
