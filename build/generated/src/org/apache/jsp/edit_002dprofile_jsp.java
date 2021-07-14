package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.enterprise.context.RequestScoped;

public final class edit_002dprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from pixner.net/boleto/demo/movie-checkout.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:47:25 GMT -->\n");
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
      out.write("    <!-- ==========Overlay========== -->\n");
      out.write("    <div class=\"overlay\"></div>\n");
      out.write("    <a href=\"#0\" class=\"scrollToTop\">\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("    <!-- ==========Overlay========== -->\n");
      out.write("\n");
      out.write("    <!-- ==========Header-Section========== -->\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("\n");
      out.write("    <!-- ==========Header-Section========== -->\n");
      out.write("\n");
      out.write("    <!-- ==========Banner-Section========== -->\n");
      out.write("    \n");
      out.write("    <!-- ==========Banner-Section========== -->\n");
      out.write("\n");
      out.write("    <!-- ==========Page-Title========== -->\n");
      out.write("    \n");
      out.write("    <!-- ==========Page-Title========== -->\n");
      out.write("\n");
      out.write("    <!-- ==========Movie-Section========== -->\n");
      out.write("    <div class=\"movie-facility padding-bottom padding-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("<!--                    <div class=\"checkout-widget d-flex flex-wrap align-items-center justify-cotent-between\">\n");
      out.write("                        <div class=\"title-area\">\n");
      out.write("                            <h5 class=\"title\">Already a Boleto  Member?</h5>\n");
      out.write("                            <p>Sign in to earn points and make booking easier!</p>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#0\" class=\"sign-in-area\">\n");
      out.write("                            <i class=\"fas fa-user\"></i><span>Sign in</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>-->\n");
      out.write("                    <div class=\"checkout-widget checkout-contact\">\n");
      out.write("                        <h5 class=\"title\">Edit profile </h5>\n");
      out.write("                        <form class=\"checkout-contact-form\" method=\"POST\" action=\"edit-profile\">\n");
      out.write("                            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                ID: <input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                Name: <input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                Email: <input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                Password: <input type=\"password\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                Address:<input type=\"text\" name=\"address\" value=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                Phone: <input type=\"text\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"submit\" value=\"Save\" class=\"custom-button\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ==========Movie-Section========== -->\n");
      out.write("\n");
      out.write("    <!-- ==========Newslater-Section========== -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\n");
      out.write("    <!-- ==========Newslater-Section========== -->\n");
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
      out.write("<!-- Mirrored from pixner.net/boleto/demo/movie-checkout.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:47:26 GMT -->\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_0.setVar("acc");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
