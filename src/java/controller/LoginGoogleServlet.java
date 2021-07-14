package controller;
import controller.GooglePojo;
import controller.GoogleUtils;
import dal.CustomerAccount;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
@WebServlet("/login-google")
public class LoginGoogleServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  public LoginGoogleServlet() {
    super();
  }
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String code = request.getParameter("code");
    if (code == null || code.isEmpty()) {
      RequestDispatcher dis = request.getRequestDispatcher("login");
      dis.forward(request, response);
    } else {
        System.out.println(code);
      String accessToken = GoogleUtils.getToken(code);
        System.out.println(accessToken);
      GooglePojo googlePojo = GoogleUtils.getUserInfo(accessToken);
      request.setAttribute("id", googlePojo.getId());
      request.setAttribute("name", googlePojo.getName());
      request.setAttribute("email", googlePojo.getEmail());
//        System.out.println(googlePojo.getEmail()+"UOA");
        Account a = new Account(googlePojo.getEmail(), googlePojo.getId());
        CustomerAccount c = new CustomerAccount();
        if(!c.checkAccountExist(googlePojo.getEmail())){
            c.create(a);
            SignUpControl s = new SignUpControl();
            s.sendMail(a.getEmail(), "Welcome to Boleto", "Hello, "+a.getEmail());
        }else{
            
            c.updateAccount(a.getEmail(), a.getPassword());
        }
      HttpSession session = request.getSession();
      session.setAttribute("account", a);
//        System.out.println(googlePojo.getEmail()+"mail");
     
      
      request.getRequestDispatcher("home").forward(request, response);
    }
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}