package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_002din_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from pixner.net/boleto/demo/sign-in.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:52:27 GMT -->\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/flaticon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/odometer.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.theme.default.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/images/favicon.png\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("    <title>Boleto  - Online Ticket Booking Website HTML Template</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- ==========Preloader========== -->\r\n");
      out.write("    <div class=\"preloader\">\r\n");
      out.write("        <div class=\"preloader-inner\">\r\n");
      out.write("            <div class=\"preloader-icon\">\r\n");
      out.write("                <span></span>\r\n");
      out.write("                <span></span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ==========Preloader========== -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- ==========Sign-In-Section========== -->\r\n");
      out.write("    <section class=\"account-section bg_img\" data-background=\"assets/images/account/account-bg.jpg\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"padding-top padding-bottom\">\r\n");
      out.write("                <div class=\"account-area\">\r\n");
      out.write("                    <div class=\"section-header-3\">\r\n");
      out.write("                        <span class=\"cate\">hello</span>\r\n");
      out.write("                        <h2 class=\"title\">welcome back</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form class=\"account-form\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"email2\">Email<span>*</span></label>\r\n");
      out.write("                            <input type=\"email\" placeholder=\"Enter Your Email\" id=\"email2\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"pass3\">Password<span>*</span></label>\r\n");
      out.write("                            <input type=\"password\" placeholder=\"Password\" id=\"pass3\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group checkgroup\">\r\n");
      out.write("                            <input type=\"checkbox\" id=\"bal2\" required checked>\r\n");
      out.write("                            <label for=\"bal2\">remember password</label>\r\n");
      out.write("                            <a href=\"#0\" class=\"forget-pass\">Forget Password</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group text-center\">\r\n");
      out.write("                            <input type=\"submit\" value=\"log in\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <div class=\"option\">\r\n");
      out.write("                        Don't have an account? <a href=\"sign-up.html\">sign up now</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"or\"><span>Or</span></div>\r\n");
      out.write("                    <ul class=\"social-icons\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#0\">\r\n");
      out.write("                                <i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#0\" class=\"active\">\r\n");
      out.write("                                <i class=\"fab fa-twitter\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#0\">\r\n");
      out.write("                                <i class=\"fab fa-google\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- ==========Sign-In-Section========== -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"assets/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/modernizr-3.6.0.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/plugins.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/isotope.pkgd.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/magnific-popup.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/countdown.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/odometer.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/viewport.jquery.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/nice-select.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from pixner.net/boleto/demo/sign-in.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:52:28 GMT -->\r\n");
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
