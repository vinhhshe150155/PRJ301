/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.TicketDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "OrderControl", urlPatterns = {"/order"})
public class OrderControl extends HttpServlet {

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
            out.println("<title>Servlet OrderControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OrderControl at " + request.getParameter("seat-array") + "</h1>");
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
    public boolean checkExistTicket(int id, List<Ticket> t){
        for(Ticket tk:t){
            if(tk.getId()==id){
                return true;
            }
        }
        return false;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
//        System.out.println((Account)request.getSession().getAttribute("account"));
        String []seats = request.getParameter("seat-array").split(",");
        List<Ticket> cart;
        List<Ticket> new_cart = new ArrayList<>();
        cart = session.getAttribute("cart")==null?new ArrayList<>():(List<Ticket>)session.getAttribute("cart");
//        System.out.println("v");
//        System.out.println("UOA"+cart.size());

        for(String s:seats){
            cart.add(new TicketDAO().getTicketByID(s));
//            System.out.print(s+"|");
        }               
        
        for(Ticket t:cart){
            if(!checkExistTicket(t.getId(), new_cart)){
                new_cart.add(t);
            }
        }
//        TicketDAO dao = new TicketDAO();
//                HttpSession session = request.getSession();
//                session.setAttribute("account", new Account(email, password1));
                
//        Account acc =  (Account)session.getAttribute("account");
        
        
//        System.out.println(session.getAttribute("account"));
        Account acc = (Account) session.getAttribute("account");
    
//        customer = new Account("", "");
//        System.out.println(customer.getEmail());
//        customer = new Account("1", "1");
        if(acc==null){
            response.sendRedirect("login");
//            System.out.println("UOA");
        }else{
//            for(Ticket t:cart){
//                dao.updateTicket(t.getId(), 1);
//            }
            session.setAttribute("cart", new_cart);
            request.getRequestDispatcher("movie-checkout.jsp").forward(request, response);
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
