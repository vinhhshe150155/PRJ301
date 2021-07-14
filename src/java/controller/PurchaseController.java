/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.BillDAO;
import dal.CustomerAccount;
import dal.PurchaseDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Ticket;

/**
 *
 * @author Admin
 */
@WebServlet(name = "PurchaseController", urlPatterns = {"/purchase"})
public class PurchaseController extends HttpServlet {

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
            out.println("<title>Servlet PurchaseController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PurchaseController at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession();
        String s = "";
        List<Ticket> cart = (List<Ticket>) session.getAttribute("cart");
        for(Ticket tk: cart){
            s+=tk.getId()+",";
        }
        if(s.length()>0){
            s = s.substring(0, s.length()-1);
        }
        SignUpControl sUp = new SignUpControl();
        session.removeAttribute("cart");
        Account acc = (Account) request.getSession().getAttribute("account");
        PurchaseDAO p = new PurchaseDAO();
        p.insertOrderDetails(cart, new CustomerAccount().getAccountIdByEmail(acc.getEmail()));
        Account a = (Account) session.getAttribute("account");
        sUp.sendMail(acc.getEmail(), "Booking successfully", "Ticket Ordered: "+s);
//        PrintWriter out = response.getWriter();
//        out.print("UOA thanh toan ok luon nhe: "+a.getEmail());
        
        response.sendRedirect("order-history");
        
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
