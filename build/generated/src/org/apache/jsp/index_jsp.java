package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.enterprise.context.RequestScoped;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:substringBefore", org.apache.taglibs.standard.functions.Functions.class, "substringBefore", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <!-- Mirrored from pixner.net/boleto/demo/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:43:23 GMT -->\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/all.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/animate.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/flaticon.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/odometer.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.theme.default.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/jquery.animatedheadline.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"shortcut icon\"\r\n");
      out.write("      href=\"assets/images/favicon.png\"\r\n");
      out.write("      type=\"image/x-icon\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <title>Boleto - Online Ticket Booking Website HTML Template</title>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <!-- ==========Preloader========== -->\r\n");
      out.write("    <div class=\"preloader\">\r\n");
      out.write("      <div class=\"preloader-inner\">\r\n");
      out.write("        <div class=\"preloader-icon\">\r\n");
      out.write("          <span></span>\r\n");
      out.write("          <span></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ==========Preloader========== -->\r\n");
      out.write("    <!-- ==========Overlay========== -->\r\n");
      out.write("    <div class=\"overlay\"></div>\r\n");
      out.write("    <a href=\"#0\" class=\"scrollToTop\">\r\n");
      out.write("      <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <!-- ==========Overlay========== -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ==========Header-Section========== -->\r\n");
      out.write("    <header class=\"header-section\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"header-wrapper\">\r\n");
      out.write("          <div class=\"logo\">\r\n");
      out.write("            <a href=\"index.jsp\">\r\n");
      out.write("              <img src=\"assets/images/logo/logo.png\" alt=\"logo\" />\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <ul class=\"menu\">\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"index.jsp\" class=\"active\">Home</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"movie-list.html\">movies</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"events.html\">events</a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#0\">pages</a>\r\n");
      out.write("              <ul class=\"submenu\">\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a href=\"about.html\">About Us</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a href=\"apps-download.html\">Apps Download</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a href=\"sign-in.jsp\">Sign In</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a href=\"sign-up.jsp\">Sign Up</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a href=\"404.html\">404</a>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"blog.html\">blog</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"contact.html\">contact</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"header-button pr-0\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <div class=\"header-bar d-lg-none\">\r\n");
      out.write("            <span></span>\r\n");
      out.write("            <span></span>\r\n");
      out.write("            <span></span>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- ==========Header-Section========== -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ==========Banner-Section========== -->\r\n");
      out.write("    <section class=\"banner-section\">\r\n");
      out.write("      <div\r\n");
      out.write("        class=\"banner-bg bg_img bg-fixed\"\r\n");
      out.write("        data-background=\"assets/images/banner/banner01.jpg\"\r\n");
      out.write("      ></div>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"banner-content\">\r\n");
      out.write("          <h1 class=\"title cd-headline clip\">\r\n");
      out.write("            <span class=\"d-block\">book your</span> tickets for\r\n");
      out.write("            <span class=\"color-theme cd-words-wrapper p-0 m-0\">\r\n");
      out.write("              <b class=\"is-visible\">Movie</b>\r\n");
      out.write("            </span>\r\n");
      out.write("          </h1>\r\n");
      out.write("          <p>Safe, secure, reliable ticketing!</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- ==========Banner-Section========== -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ==========Ticket-Search========== -->\r\n");
      out.write("    <section class=\"search-ticket-section padding-top pt-lg-0\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div\r\n");
      out.write("          class=\"search-tab bg_img\"\r\n");
      out.write("          data-background=\"assets/images/ticket/ticket-bg01.jpg\"\r\n");
      out.write("        >\r\n");
      out.write("          <div class=\"row align-items-center mb--20\">\r\n");
      out.write("            <div class=\"col-lg-6 mb-20\">\r\n");
      out.write("              <div class=\"search-ticket-header\">\r\n");
      out.write("                <h6 class=\"category\">welcome to Boleto</h6>\r\n");
      out.write("                <h3 class=\"title\">what are you looking for</h3>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"tab-area\">\r\n");
      out.write("            <div class=\"tab-item active\">\r\n");
      out.write("              <form class=\"ticket-search-form\">\r\n");
      out.write("                <div class=\"form-group large\">\r\n");
      out.write("                  <input type=\"text\" placeholder=\"Search for Movies\" />\r\n");
      out.write("                  <button type=\"submit\"><i class=\"fas fa-search\"></i></button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <div class=\"thumb\">\r\n");
      out.write("                    <img src=\"assets/images/ticket/city.png\" alt=\"ticket\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <span class=\"type\">city</span>\r\n");
      out.write("                  <select class=\"select-bar\">\r\n");
      out.write("                    <option value=\"london\">London</option>\r\n");
      out.write("                    <option value=\"dhaka\">dhaka</option>\r\n");
      out.write("                    <option value=\"rosario\">rosario</option>\r\n");
      out.write("                    <option value=\"madrid\">madrid</option>\r\n");
      out.write("                    <option value=\"koltaka\">kolkata</option>\r\n");
      out.write("                    <option value=\"rome\">rome</option>\r\n");
      out.write("                    <option value=\"khoksa\">khoksa</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <div class=\"thumb\">\r\n");
      out.write("                    <img src=\"assets/images/ticket/date.png\" alt=\"ticket\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <span class=\"type\">date</span>\r\n");
      out.write("                  <select class=\"select-bar\">\r\n");
      out.write("                    <option value=\"26-12-19\">23/10/2020</option>\r\n");
      out.write("                    <option value=\"26-12-19\">24/10/2020</option>\r\n");
      out.write("                    <option value=\"26-12-19\">25/10/2020</option>\r\n");
      out.write("                    <option value=\"26-12-19\">26/10/2020</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <div class=\"thumb\">\r\n");
      out.write("                    <img src=\"assets/images/ticket/cinema.png\" alt=\"ticket\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <span class=\"type\">cinema</span>\r\n");
      out.write("                  <select class=\"select-bar\">\r\n");
      out.write("                    <option value=\"Awaken\">Awaken</option>\r\n");
      out.write("                    <option value=\"dhaka\">dhaka</option>\r\n");
      out.write("                    <option value=\"rosario\">rosario</option>\r\n");
      out.write("                    <option value=\"madrid\">madrid</option>\r\n");
      out.write("                    <option value=\"koltaka\">kolkata</option>\r\n");
      out.write("                    <option value=\"rome\">rome</option>\r\n");
      out.write("                    <option value=\"khoksa\">khoksa</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"tab-item\">\r\n");
      out.write("              <form class=\"ticket-search-form\">\r\n");
      out.write("                <div class=\"form-group large\">\r\n");
      out.write("                  <input type=\"text\" placeholder=\"Search for Events\" />\r\n");
      out.write("                  <button type=\"submit\"><i class=\"fas fa-search\"></i></button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <div class=\"thumb\">\r\n");
      out.write("                    <img src=\"assets/images/ticket/city.png\" alt=\"ticket\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <span class=\"type\">city</span>\r\n");
      out.write("                  <select class=\"select-bar\">\r\n");
      out.write("                    <option value=\"london\">London</option>\r\n");
      out.write("                    <option value=\"dhaka\">dhaka</option>\r\n");
      out.write("                    <option value=\"rosario\">rosario</option>\r\n");
      out.write("                    <option value=\"madrid\">madrid</option>\r\n");
      out.write("                    <option value=\"koltaka\">kolkata</option>\r\n");
      out.write("                    <option value=\"rome\">rome</option>\r\n");
      out.write("                    <option value=\"khoksa\">khoksa</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <div class=\"thumb\">\r\n");
      out.write("                    <img src=\"assets/images/ticket/date.png\" alt=\"ticket\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <span class=\"type\">date</span>\r\n");
      out.write("                  <select class=\"select-bar\">\r\n");
      out.write("                    <option value=\"26-12-19\">23/10/2020</option>\r\n");
      out.write("                    <option value=\"26-12-19\">24/10/2020</option>\r\n");
      out.write("                    <option value=\"26-12-19\">25/10/2020</option>\r\n");
      out.write("                    <option value=\"26-12-19\">26/10/2020</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <div class=\"thumb\">\r\n");
      out.write("                    <img src=\"assets/images/ticket/cinema.png\" alt=\"ticket\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <span class=\"type\">event</span>\r\n");
      out.write("                  <select class=\"select-bar\">\r\n");
      out.write("                    <option value=\"angular\">angular</option>\r\n");
      out.write("                    <option value=\"startup\">startup</option>\r\n");
      out.write("                    <option value=\"rosario\">rosario</option>\r\n");
      out.write("                    <option value=\"madrid\">madrid</option>\r\n");
      out.write("                    <option value=\"koltaka\">kolkata</option>\r\n");
      out.write("                    <option value=\"Last-First\">Last-First</option>\r\n");
      out.write("                    <option value=\"wish\">wish</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"tab-item\">\r\n");
      out.write("              <form class=\"ticket-search-form\">\r\n");
      out.write("                <div class=\"form-group large\">\r\n");
      out.write("                  <input type=\"text\" placeholder=\"Search fo Sports\" />\r\n");
      out.write("                  <button type=\"submit\"><i class=\"fas fa-search\"></i></button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <div class=\"thumb\">\r\n");
      out.write("                    <img src=\"assets/images/ticket/city.png\" alt=\"ticket\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <span class=\"type\">city</span>\r\n");
      out.write("                  <select class=\"select-bar\">\r\n");
      out.write("                    <option value=\"london\">London</option>\r\n");
      out.write("                    <option value=\"dhaka\">dhaka</option>\r\n");
      out.write("                    <option value=\"rosario\">rosario</option>\r\n");
      out.write("                    <option value=\"madrid\">madrid</option>\r\n");
      out.write("                    <option value=\"koltaka\">kolkata</option>\r\n");
      out.write("                    <option value=\"rome\">rome</option>\r\n");
      out.write("                    <option value=\"khoksa\">khoksa</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <div class=\"thumb\">\r\n");
      out.write("                    <img src=\"assets/images/ticket/date.png\" alt=\"ticket\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <span class=\"type\">date</span>\r\n");
      out.write("                  <select class=\"select-bar\">\r\n");
      out.write("                    <option value=\"26-12-19\">23/10/2020</option>\r\n");
      out.write("                    <option value=\"26-12-19\">24/10/2020</option>\r\n");
      out.write("                    <option value=\"26-12-19\">25/10/2020</option>\r\n");
      out.write("                    <option value=\"26-12-19\">26/10/2020</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <div class=\"thumb\">\r\n");
      out.write("                    <img src=\"assets/images/ticket/cinema.png\" alt=\"ticket\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <span class=\"type\">sports</span>\r\n");
      out.write("                  <select class=\"select-bar\">\r\n");
      out.write("                    <option value=\"football\">football</option>\r\n");
      out.write("                    <option value=\"cricket\">cricket</option>\r\n");
      out.write("                    <option value=\"cabadi\">cabadi</option>\r\n");
      out.write("                    <option value=\"madrid\">madrid</option>\r\n");
      out.write("                    <option value=\"gadon\">gadon</option>\r\n");
      out.write("                    <option value=\"rome\">rome</option>\r\n");
      out.write("                    <option value=\"khoksa\">khoksa</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("              </form>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- ==========Ticket-Search========== -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ==========Movie-Main-Section========== -->\r\n");
      out.write("    <section class=\"movie-section padding-top padding-bottom bg-two\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row flex-wrap-reverse justify-content-center\">\r\n");
      out.write("          <div class=\"col-lg-3 col-sm-10 mt-50 mt-lg-0\">\r\n");
      out.write("            <div class=\"widget-1 widget-facility\">\r\n");
      out.write("              <div class=\"widget-1-body\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a href=\"#0\">\r\n");
      out.write("                      <span class=\"img\"\r\n");
      out.write("                        ><img\r\n");
      out.write("                          src=\"assets/images/sidebar/icons/sidebar01.png\"\r\n");
      out.write("                          alt=\"sidebar\"\r\n");
      out.write("                      /></span>\r\n");
      out.write("                      <span class=\"cate\">24X7 Care</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a href=\"#0\">\r\n");
      out.write("                      <span class=\"img\"\r\n");
      out.write("                        ><img\r\n");
      out.write("                          src=\"assets/images/sidebar/icons/sidebar02.png\"\r\n");
      out.write("                          alt=\"sidebar\"\r\n");
      out.write("                      /></span>\r\n");
      out.write("                      <span class=\"cate\">100% Assurance</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a href=\"#0\">\r\n");
      out.write("                      <span class=\"img\"\r\n");
      out.write("                        ><img\r\n");
      out.write("                          src=\"assets/images/sidebar/icons/sidebar03.png\"\r\n");
      out.write("                          alt=\"sidebar\"\r\n");
      out.write("                      /></span>\r\n");
      out.write("                      <span class=\"cate\">Our Promise</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"widget-1 widget-banner\">\r\n");
      out.write("              <div class=\"widget-1-body\">\r\n");
      out.write("                <a href=\"#0\">\r\n");
      out.write("                  <img\r\n");
      out.write("                    src=\"assets/images/sidebar/banner/banner01.jpg\"\r\n");
      out.write("                    alt=\"banner\"\r\n");
      out.write("                  />\r\n");
      out.write("                </a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"widget-1 widget-trending-search\">\r\n");
      out.write("              <h3 class=\"title\">Trending Searches</h3>\r\n");
      out.write("              <div class=\"widget-1-body\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <h6 class=\"sub-title\">\r\n");
      out.write("                      <a href=\"#0\">mars</a>\r\n");
      out.write("                    </h6>\r\n");
      out.write("                    <p>Movies</p>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <h6 class=\"sub-title\">\r\n");
      out.write("                      <a href=\"#0\">alone</a>\r\n");
      out.write("                    </h6>\r\n");
      out.write("                    <p>Movies</p>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <h6 class=\"sub-title\">\r\n");
      out.write("                      <a href=\"#0\">music event</a>\r\n");
      out.write("                    </h6>\r\n");
      out.write("                    <p>event</p>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <h6 class=\"sub-title\">\r\n");
      out.write("                      <a href=\"#0\">NBA Games 2020</a>\r\n");
      out.write("                    </h6>\r\n");
      out.write("                    <p>Sports</p>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"widget-1 widget-banner\">\r\n");
      out.write("              <div class=\"widget-1-body\">\r\n");
      out.write("                <a href=\"#0\">\r\n");
      out.write("                  <img\r\n");
      out.write("                    src=\"assets/images/sidebar/banner/banner02.jpg\"\r\n");
      out.write("                    alt=\"banner\"\r\n");
      out.write("                  />\r\n");
      out.write("                </a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-lg-9\">\r\n");
      out.write("            <div class=\"article-section padding-bottom\">\r\n");
      out.write("              <div class=\"section-header-1\">\r\n");
      out.write("                <h2 class=\"title\">movies</h2>\r\n");
      out.write("                <a class=\"view-all\" href=\"/films\">View All</a>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"row mb-30-none justify-content-center\">\r\n");
      out.write("                  <!--film-->\r\n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                  <!--film-->\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"article-section padding-bottom\">\r\n");
      out.write("              <div class=\"section-header-1\">\r\n");
      out.write("                <h2 class=\"title\">events</h2>\r\n");
      out.write("                <a class=\"view-all\" href=\"events.html\">View All</a>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"row mb-30-none justify-content-center\">\r\n");
      out.write("                <div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("                  <div class=\"event-grid\">\r\n");
      out.write("                    <div class=\"movie-thumb c-thumb\">\r\n");
      out.write("                      <a href=\"#0\">\r\n");
      out.write("                        <img\r\n");
      out.write("                          src=\"assets/images/event/event01.jpg\"\r\n");
      out.write("                          alt=\"event\"\r\n");
      out.write("                        />\r\n");
      out.write("                      </a>\r\n");
      out.write("                      <div class=\"event-date\">\r\n");
      out.write("                        <h6 class=\"date-title\">28</h6>\r\n");
      out.write("                        <span>Dec</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"movie-content bg-one\">\r\n");
      out.write("                      <h5 class=\"title m-0\">\r\n");
      out.write("                        <a href=\"#0\">Digital Economy Conference 2020</a>\r\n");
      out.write("                      </h5>\r\n");
      out.write("                      <div class=\"movie-rating-percent\">\r\n");
      out.write("                        <span>327 Montague Street</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("                  <div class=\"event-grid\">\r\n");
      out.write("                    <div class=\"movie-thumb c-thumb\">\r\n");
      out.write("                      <a href=\"#0\">\r\n");
      out.write("                        <img\r\n");
      out.write("                          src=\"assets/images/event/event02.jpg\"\r\n");
      out.write("                          alt=\"event\"\r\n");
      out.write("                        />\r\n");
      out.write("                      </a>\r\n");
      out.write("                      <div class=\"event-date\">\r\n");
      out.write("                        <h6 class=\"date-title\">28</h6>\r\n");
      out.write("                        <span>Dec</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"movie-content bg-one\">\r\n");
      out.write("                      <h5 class=\"title m-0\">\r\n");
      out.write("                        <a href=\"#0\">web design conference 2020</a>\r\n");
      out.write("                      </h5>\r\n");
      out.write("                      <div class=\"movie-rating-percent\">\r\n");
      out.write("                        <span>327 Montague Street</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("                  <div class=\"event-grid\">\r\n");
      out.write("                    <div class=\"movie-thumb c-thumb\">\r\n");
      out.write("                      <a href=\"#0\">\r\n");
      out.write("                        <img\r\n");
      out.write("                          src=\"assets/images/event/event03.jpg\"\r\n");
      out.write("                          alt=\"event\"\r\n");
      out.write("                        />\r\n");
      out.write("                      </a>\r\n");
      out.write("                      <div class=\"event-date\">\r\n");
      out.write("                        <h6 class=\"date-title\">28</h6>\r\n");
      out.write("                        <span>Dec</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"movie-content bg-one\">\r\n");
      out.write("                      <h5 class=\"title m-0\">\r\n");
      out.write("                        <a href=\"#0\">digital thinkers meetup</a>\r\n");
      out.write("                      </h5>\r\n");
      out.write("                      <div class=\"movie-rating-percent\">\r\n");
      out.write("                        <span>327 Montague Street</span>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- ==========Movie-Main-Section========== -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ==========Newslater-Section========== -->\r\n");
      out.write("    <footer class=\"footer-section\">\r\n");
      out.write("      <div class=\"newslater-section padding-bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div\r\n");
      out.write("            class=\"newslater-container bg_img\"\r\n");
      out.write("            data-background=\"assets/images/newslater/newslater-bg01.jpg\"\r\n");
      out.write("          >\r\n");
      out.write("            <div class=\"newslater-wrapper\">\r\n");
      out.write("              <h5 class=\"cate\">subscribe to Boleto</h5>\r\n");
      out.write("              <h3 class=\"title\">to get exclusive benifits</h3>\r\n");
      out.write("              <form class=\"newslater-form\">\r\n");
      out.write("                <input type=\"text\" placeholder=\"Your Email Address\" />\r\n");
      out.write("                <button type=\"submit\">subscribe</button>\r\n");
      out.write("              </form>\r\n");
      out.write("              <p>We respect your privacy, so we never share your info</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"footer-top\">\r\n");
      out.write("          <div class=\"logo\">\r\n");
      out.write("            <a href=\"index-1.html\">\r\n");
      out.write("              <img src=\"assets/images/footer/footer-logo.png\" alt=\"footer\" />\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <ul class=\"social-icons\">\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#0\">\r\n");
      out.write("                <i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#0\" class=\"active\">\r\n");
      out.write("                <i class=\"fab fa-twitter\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#0\">\r\n");
      out.write("                <i class=\"fab fa-pinterest-p\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#0\">\r\n");
      out.write("                <i class=\"fab fa-google\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"#0\">\r\n");
      out.write("                <i class=\"fab fa-instagram\"></i>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer-bottom\">\r\n");
      out.write("          <div class=\"footer-bottom-area\">\r\n");
      out.write("            <div class=\"left\">\r\n");
      out.write("              <p>\r\n");
      out.write("                Copyright Â© 2020.All Rights Reserved By <a href=\"#0\">Boleto </a>\r\n");
      out.write("              </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"links\">\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"#0\">About</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"#0\">Terms Of Use</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"#0\">Privacy Policy</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"#0\">FAQ</a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"#0\">Feedback</a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- ==========Newslater-Section========== -->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"assets/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/modernizr-3.6.0.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/plugins.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/heandline.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/isotope.pkgd.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/magnific-popup.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/countdown.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/odometer.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/viewport.jquery.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/nice-select.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("\r\n");
      out.write("  <!-- Mirrored from pixner.net/boleto/demo/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:44:42 GMT -->\r\n");
      out.write("</html>\r\n");
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
    _jspx_th_c_set_0.setVar("acc");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <a href=\"sign-up.jsp\">join us</a>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <p>Hello, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:substringBefore(acc.email,\"@\")}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("</p>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${applicationScope.films}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("film");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                      <div class=\"col-sm-6 col-lg-4\">\r\n");
          out.write("                  <div class=\"movie-grid\">\r\n");
          out.write("                    <div class=\"movie-thumb c-thumb\">\r\n");
          out.write("                      <a href=\"#0\">\r\n");
          out.write("                        <img\r\n");
          out.write("                          src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.film_image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("                          alt=\"movie\"\r\n");
          out.write("                        />\r\n");
          out.write("                       \r\n");
          out.write("                      </a>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    <div class=\"movie-content bg-one\">\r\n");
          out.write("                      <h5 class=\"title m-0\">\r\n");
          out.write("                        <a href=\"#0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                      </h5>\r\n");
          out.write("                      \r\n");
          out.write("                      <ul class=\"movie-rating-percent\">\r\n");
          out.write("                          <li>\r\n");
          out.write("                              <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${film.duration}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" min</p>\r\n");
          out.write("                          </li>\r\n");
          out.write("                        <li>\r\n");
          out.write("                          <div class=\"thumb\">\r\n");
          out.write("                            <img\r\n");
          out.write("                              src=\"assets/images/movie/tomato.png\"\r\n");
          out.write("                              alt=\"movie\"\r\n");
          out.write("                            />\r\n");
          out.write("                          </div>\r\n");
          out.write("                          <span class=\"content\">88%</span>\r\n");
          out.write("                        </li>\r\n");
          out.write("                        <li>\r\n");
          out.write("                          <div class=\"thumb\">\r\n");
          out.write("                            <img\r\n");
          out.write("                              src=\"assets/images/movie/cake.png\"\r\n");
          out.write("                              alt=\"movie\"\r\n");
          out.write("                            />\r\n");
          out.write("                          </div>\r\n");
          out.write("                          <span class=\"content\">88%</span>\r\n");
          out.write("                        </li>\r\n");
          out.write("                      </ul>\r\n");
          out.write("                    </div>\r\n");
          out.write("                  </div>\r\n");
          out.write("                </div>\r\n");
          out.write("                  ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
