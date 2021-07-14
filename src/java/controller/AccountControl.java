/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CustomerAccount;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AccountControl", urlPatterns = {"/admin-accountControl"})
public class AccountControl extends HttpServlet {
    CustomerAccount c = new CustomerAccount();
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
            out.println("<title>Servlet AccountControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AccountControl at " + request.getContextPath()+ "</h1>");
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
        try{
            Integer action = Integer.parseInt(request.getParameter("type"));
            
            switch(action){
                case 1:
                    Integer id = Integer.parseInt(request.getParameter("acc"));
                    request.setAttribute("acc", c.getAccountIdById(id));
                    request.getRequestDispatcher("admin_account_edit.jsp").forward(request, response);
                    break;
                case 0:
//                    request.getRequestDispatcher("").forward(request, response);
//                    processRequest(request, response);
                    request.getRequestDispatcher("admin_account.jsp").forward(request, response);
                    break;
            }
        }catch(NumberFormatException e){
            System.out.println(e);
            
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
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        System.out.println("ID: "+id);
        System.out.println("name: "+name);
        System.out.println("UPDATE: "+c.updateAccount(id, name, email, password, address, phone));
        request.getRequestDispatcher("admin_account.jsp").forward(request, response);
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
