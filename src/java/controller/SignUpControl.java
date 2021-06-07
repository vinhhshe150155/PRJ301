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
public class SignUpControl extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        CustomerAccount db = new CustomerAccount();
        if(!password1.equals(password2)){
            request.setAttribute("error", "Password does not match!");
            request.getRequestDispatcher("sign-up.jsp").forward(request, response);
        }else{
            if(db.checkAccountExist(email)){
                request.setAttribute("error", email+" existed!");
                request.getRequestDispatcher("sign-up.jsp").forward(request, response);
            }else{
                db.create(new Account(email, password1));
                HttpSession session = request.getSession();
                session.setAttribute("account", new Account(email, password1));
                response.sendRedirect("index.jsp");
        }
        }
       
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
