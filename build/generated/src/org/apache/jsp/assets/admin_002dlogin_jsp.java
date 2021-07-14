package org.apache.jsp.assets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from pixner.net/boleto/demo/sign-in.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:52:27 GMT -->\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/flaticon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/odometer.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.theme.default.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/images/favicon.png\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("    <title>Boleto  - Online Ticket Booking Website HTML Template</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- ==========Preloader========== -->\n");
      out.write("    <div class=\"preloader\">\n");
      out.write("        <div class=\"preloader-inner\">\n");
      out.write("            <div class=\"preloader-icon\">\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ==========Preloader========== -->\n");
      out.write("    \n");
      out.write("    <!-- ==========Sign-In-Section========== -->\n");
      out.write("    <section class=\"account-section bg_img\" data-background=\"assets/images/account/account-bg.jpg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"padding-top padding-bottom\">\n");
      out.write("                <div class=\"account-area\">\n");
      out.write("                    <div class=\"section-header-3\">\n");
      out.write("                        <span class=\"cate\">hello</span>\n");
      out.write("                        <h2 class=\"title\">welcome back</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"login\" class=\"account-form\" method=\"POST\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"email2\">Email<span>*</span></label>\n");
      out.write("                            <input name=\"email\" type=\"email\" placeholder=\"Enter Your Email\" id=\"email2\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pass3\">Password<span>*</span></label>\n");
      out.write("                            <input name=\"password\" type=\"password\" placeholder=\"Password\" id=\"pass3\" minlength=\"8\" maxlength=\"50\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group checkgroup\">\n");
      out.write("                            <input type=\"checkbox\" id=\"bal2\" required checked>\n");
      out.write("                            <label for=\"bal2\">remember password</label>\n");
      out.write("                            <a href=\"#0\" class=\"forget-pass\">Forget Password</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group text-center\">\n");
      out.write("                            <input type=\"submit\" value=\"log in\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        Don't have an account? <a href=\"sign-up\">sign up now</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"or\"><span>Or</span></div>\n");
      out.write("                    <ul class=\"social-icons\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#0\">\n");
      out.write("                                <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#0\" class=\"active\">\n");
      out.write("                                <i class=\"fab fa-twitter\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/PRJ301/login-google&response_type=code\n");
      out.write("    &client_id=234581659066-a9lfu4m2ee790rq2orlmhi7v68otp6ld.apps.googleusercontent.com&approval_prompt=force\">\n");
      out.write("                                <i class=\"fab fa-google\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- ==========Sign-In-Section========== -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/modernizr-3.6.0.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/plugins.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/isotope.pkgd.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/magnific-popup.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/wow.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/countdown.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/odometer.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/viewport.jquery.js\"></script>\n");
      out.write("    <script src=\"assets/js/nice-select.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from pixner.net/boleto/demo/sign-in.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:52:28 GMT -->\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
