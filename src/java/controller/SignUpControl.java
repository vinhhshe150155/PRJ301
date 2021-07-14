package controller;
import dal.CustomerAccount;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
@WebServlet(name = "SignUpControl", urlPatterns = {"/sign-up"})
public class SignUpControl extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("sign-up.jsp").forward(request, response);
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
                response.sendRedirect("sign-up");
            }else{
                db.create(new Account(email, password1));
                HttpSession session = request.getSession();
                session.setAttribute("account", new Account(email, password1));
                sendMail(email, "Welcome to Boleto", "Hello, "+email);
                Account acc =  (Account)session.getAttribute("account");
                
                //            Object o = session.getAttribute("account");
//            Account customer =  (Account) o;
//            System.out.println("Home: "+customer.getEmail());
                System.out.println(acc.getEmail());
                response.sendRedirect("home");
        }
        }
       
    }
    public void sendMail(String email, String subject, String msg){
		
		Mailer.send(email, subject, msg);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
