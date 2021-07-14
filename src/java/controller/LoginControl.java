package controller;
import dal.CustomerAccount;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

public class LoginControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
            response.setContentType("text/html;charset=UTF-8");
            request.getRequestDispatcher("sign-in.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email=request.getParameter("email");
        String password =request.getParameter("password");
        CustomerAccount db = new CustomerAccount();
        Account a = db.getAccount(email, password);
        if(a==null){
            request.setAttribute("error", email+" does not exist");
            request.getRequestDispatcher("sign-in.jsp").forward(request, response);
        }else{
            HttpSession session=request.getSession();
            session.setAttribute("account", a);
//            Object o = session.getAttribute("account");
//            Account customer =  (Account) o;
//            System.out.println("Home: "+customer.getEmail());
//            if(customer==null){
//            response.sendRedirect("login");
//            System.out.println("UOA");
//        }
            response.sendRedirect("home");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
