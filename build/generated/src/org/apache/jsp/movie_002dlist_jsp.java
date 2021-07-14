package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.enterprise.context.RequestScoped;

public final class movie_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:substringBefore", org.apache.taglibs.standard.functions.Functions.class, "substringBefore", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from pixner.net/boleto/demo/movie-list.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:46:43 GMT -->\r\n");
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
      out.write("    <!-- ==========Overlay========== -->\r\n");
      out.write("    <div class=\"overlay\"></div>\r\n");
      out.write("    <a href=\"#0\" class=\"scrollToTop\">\r\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\r\n");
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
      out.write("              <a href=\"index.jsp\" >Home</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"movie-list.html\" class=\"active\">movies</a>\r\n");
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
      out.write("        <div class=\"banner-bg bg_img bg-fixed\" data-background=\"assets/images/banner/banner02.jpg\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"banner-content\">\r\n");
      out.write("                <h1 class=\"title bold\">get <span class=\"color-theme\">movie</span> tickets</h1>\r\n");
      out.write("                <p>Buy movie tickets in advance, find movie times watch trailers, read movie reviews and much more</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
      out.write("                    <input id=\"searchFilm\" type=\"text\" placeholder=\"Search for Movies\" />\r\n");
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
      out.write("    </section>     \r\n");
      out.write("    <!-- ==========Ticket-Search========== -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ==========Movie-Section========== -->\r\n");
      out.write("    <section class=\"movie-section padding-top padding-bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row flex-wrap-reverse justify-content-center\">\r\n");
      out.write("                <div class=\"col-sm-10 col-md-8 col-lg-3\">\r\n");
      out.write("                    <div class=\"widget-1 widget-banner\">\r\n");
      out.write("                        <div class=\"widget-1-body\">\r\n");
      out.write("                            <a href=\"#0\">\r\n");
      out.write("                                <img src=\"assets/images/sidebar/banner/banner01.jpg\" alt=\"banner\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"widget-1 widget-check\">\r\n");
      out.write("                        <div class=\"widget-header\">\r\n");
      out.write("                            <h5 class=\"m-title\">Filter By</h5>\r\n");
      out.write("                            <a class=\"uncheckall clear-check\" href=\"#0\"> Clear All</a>                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"widget-1-body\">\r\n");
      out.write("                            <h6 class=\"subtitle\">Language</h6>\r\n");
      out.write("                            <div class=\"check-area\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input  type=\"checkbox\" name=\"lang\" id=\"lang1\"><label for=\"lang1\">Tiếng Việt</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input  type=\"checkbox\" name=\"lang\" id=\"lang2\"><label for=\"lang2\">Tiếng Anh</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input  type=\"checkbox\" name=\"lang\" id=\"lang3\"><label for=\"lang3\">Hàn</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input  type=\"checkbox\" name=\"lang\" id=\"lang4\"><label for=\"lang4\">Tiếng Nhật</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input  type=\"checkbox\" name=\"lang\" id=\"lang5\"><label for=\"lang5\">Tiếng Pháp</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input  type=\"checkbox\" name=\"lang\" id=\"lang6\"><label for=\"lang6\">Tiếng Trung</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input  type=\"checkbox\" name=\"lang\" id=\"lang7\"><label for=\"lang7\">Tiếng Zimbabwe</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"widget-1 widget-check\">\r\n");
      out.write("                        <div class=\"widget-1-body\">\r\n");
      out.write("                            <h6 class=\"subtitle\">Category</h6>\r\n");
      out.write("                            <div class=\"check-area\">\r\n");
      out.write("                                <form action=\"films\" method=\"get\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    <input type=\"submit\" value=\"Search\">\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"widget-1 widget-banner\">\r\n");
      out.write("                        <div class=\"widget-1-body\">\r\n");
      out.write("                            <a href=\"#0\">\r\n");
      out.write("                                <img src=\"assets/images/sidebar/banner/banner02.jpg\" alt=\"banner\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-9 mb-50 mb-lg-0\">\r\n");
      out.write("                    <div class=\"filter-tab tab\">\r\n");
      out.write("                        <div class=\"filter-area\">\r\n");
      out.write("                            <div class=\"filter-main\">\r\n");
      out.write("                                <div class=\"left\">\r\n");
      out.write("                                    <div class=\"item\">\r\n");
      out.write("                                        <span class=\"show\">Show :</span>\r\n");
      out.write("                                        <select class=\"select-bar\">\r\n");
      out.write("                                            <option value=\"12\">12</option>\r\n");
      out.write("                                            <option value=\"15\">15</option>\r\n");
      out.write("                                            <option value=\"18\">18</option>\r\n");
      out.write("                                            <option value=\"21\">21</option>\r\n");
      out.write("                                            <option value=\"24\">24</option>\r\n");
      out.write("                                            <option value=\"27\">27</option>\r\n");
      out.write("                                            <option value=\"30\">30</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"item\">\r\n");
      out.write("                                        <span class=\"show\">Sort By :</span>\r\n");
      out.write("                                        <select class=\"select-bar\">\r\n");
      out.write("                                            <option value=\"showing\">now showing</option>\r\n");
      out.write("                                            <option value=\"exclusive\">exclusive</option>\r\n");
      out.write("                                            <option value=\"trending\">trending</option>\r\n");
      out.write("                                            <option value=\"most-view\">most view</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <ul class=\"grid-button tab-menu\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <i class=\"fas fa-th\"></i>\r\n");
      out.write("                                    </li>                            \r\n");
      out.write("                                    <li class=\"active\">\r\n");
      out.write("                                        <i class=\"fas fa-bars\"></i>\r\n");
      out.write("                                    </li>                            \r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"tab-area\">\r\n");
      out.write("                            <div class=\"tab-item active\">\r\n");
      out.write("                                <div class=\"movie-area mb-10\" id=\"filmContent\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"pagination-area text-center\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_set_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!--                            <a href=\"#0\">1</a>\r\n");
      out.write("                            <a href=\"#0\">2</a>\r\n");
      out.write("                            <a href=\"#0\" class=\"active\">3</a>\r\n");
      out.write("                            <a href=\"#0\">4</a>\r\n");
      out.write("                            <a href=\"#0\">5</a>-->\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- ==========Movie-Section========== -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ==========Newslater-Section========== -->\r\n");
      out.write("    <footer class=\"footer-section\">\r\n");
      out.write("        <div class=\"newslater-section padding-bottom\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"newslater-container bg_img\" data-background=\"assets/images/newslater/newslater-bg01.jpg\">\r\n");
      out.write("                    <div class=\"newslater-wrapper\">\r\n");
      out.write("                        <h5 class=\"cate\">subscribe to Boleto </h5>\r\n");
      out.write("                        <h3 class=\"title\">to get exclusive benifits</h3>\r\n");
      out.write("                        <form class=\"newslater-form\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"Your Email Address\">\r\n");
      out.write("                            <button type=\"submit\">subscribe</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <p>We respect your privacy, so we never share your info</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"footer-top\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <a href=\"index-1.html\">\r\n");
      out.write("                        <img src=\"assets/images/footer/footer-logo.png\" alt=\"footer\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"social-icons\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#0\">\r\n");
      out.write("                            <i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#0\" class=\"active\">\r\n");
      out.write("                            <i class=\"fab fa-twitter\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#0\">\r\n");
      out.write("                            <i class=\"fab fa-pinterest-p\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#0\">\r\n");
      out.write("                            <i class=\"fab fa-google\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#0\">\r\n");
      out.write("                            <i class=\"fab fa-instagram\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-bottom\">\r\n");
      out.write("                <div class=\"footer-bottom-area\">\r\n");
      out.write("                    <div class=\"left\">\r\n");
      out.write("                        <p>Copyright © 2020.All Rights Reserved By <a href=\"#0\">Boleto </a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"links\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#0\">About</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#0\">Terms Of Use</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#0\">Privacy Policy</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#0\">FAQ</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#0\">Feedback</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- ==========Newslater-Section========== -->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
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
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("             // Check All\r\n");
      out.write("             $('.checkall').click(function() {\r\n");
      out.write("                 $(\"input:checkbox\").attr(\"checked\", true);\r\n");
      out.write("             });\r\n");
      out.write("             // Uncheck All\r\n");
      out.write("             $('.uncheckall').click(function() {\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                 $('input[type=checkbox]').prop('checked',false);\r\n");
      out.write("             });\r\n");
      out.write("         });  \r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("                $(document).ready(function(){          \r\n");
      out.write("\r\n");
      out.write("                $('#searchFilm').on('input', function(){\r\n");
      out.write("\r\n");
      out.write("                        var name = $('#searchFilm').val();\r\n");
      out.write("\r\n");
      out.write("                        $.ajax({\r\n");
      out.write("\r\n");
      out.write("                                type: \"GET\",\r\n");
      out.write("\r\n");
      out.write("                                url : \"SearchAjax\",\r\n");
      out.write("\r\n");
      out.write("                                data: {name: name},\r\n");
      out.write("\r\n");
      out.write("                                success: function(responseText){\r\n");
      out.write("\r\n");
      out.write("                                        document.getElementById(\"result\").innerHTML = responseText;\r\n");
      out.write("\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from pixner.net/boleto/demo/movie-list.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:46:43 GMT -->\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <div class=\"form-group\">\r\n");
          out.write("                                            ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                            <input  type=\"checkbox\" name=\"cate\" id=\"cate");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contains?\"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("><label for=\"cate");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\r\n");
          out.write("                                        </div>                                        \r\n");
          out.write("                                    ");
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

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setVar("contains");
    _jspx_th_c_set_1.setValue(new String("false"));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setVar("item");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.cateChecked}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item eq c.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_set_2.setVar("contains");
    _jspx_th_c_set_2.setValue(new String("true"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.films}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("f");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"movie-list\">\r\n");
          out.write("                                        <div class=\"movie-thumb c-thumb\">\r\n");
          out.write("                                            <a href=\"movie-details.html\" class=\"w-100 bg_img h-100\" data-background=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.film_image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                <img class=\"d-sm-none\" src=\"\" alt=\"movie\">\r\n");
          out.write("                                            </a>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <div class=\"movie-content bg-one\">\r\n");
          out.write("                                            <h5 class=\"title\">\r\n");
          out.write("                                                <a href=\"movie-details.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                            </h5>\r\n");
          out.write("                                            <p class=\"duration\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.duration}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" min</p>\r\n");
          out.write("                                            <div class=\"movie-tags\">\r\n");
          out.write("                                                <a href=\"#0\">action</a>\r\n");
          out.write("                                                <a href=\"#0\">adventure</a>\r\n");
          out.write("                                                <a href=\"#0\">fantasy</a>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                            <div class=\"release\">\r\n");
          out.write("                                                <span>Release Date : </span> <a href=\"#0\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.film_start_date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                            <ul class=\"movie-rating-percent\">\r\n");
          out.write("                                                <li>\r\n");
          out.write("                                                    <div class=\"thumb\">\r\n");
          out.write("                                                        <img src=\"assets/images/movie/tomato.png\" alt=\"movie\">\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <span class=\"content\">88%</span>\r\n");
          out.write("                                                </li>\r\n");
          out.write("                                                <li>\r\n");
          out.write("                                                    <div class=\"thumb\">\r\n");
          out.write("                                                        <img src=\"assets/images/movie/cake.png\" alt=\"movie\">\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <span class=\"content\">88%</span>\r\n");
          out.write("                                                </li>\r\n");
          out.write("                                            </ul>\r\n");
          out.write("                                            <div class=\"book-area\">\r\n");
          out.write("                                                <div class=\"book-ticket\">\r\n");
          out.write("                                                    <div class=\"react-item\">\r\n");
          out.write("                                                        <a href=\"#0\">\r\n");
          out.write("                                                            <div class=\"thumb\">\r\n");
          out.write("                                                                <img src=\"assets/images/icons/heart.png\" alt=\"icons\">\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </a>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"react-item mr-auto\">\r\n");
          out.write("                                                        <a href=\"seat?film=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.filmID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                            <div class=\"thumb\">\r\n");
          out.write("                                                                <img src=\"assets/images/icons/book.png\" alt=\"icons\">\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                            <span>book ticket</span>\r\n");
          out.write("                                                        </a>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"react-item\">\r\n");
          out.write("                                                        <a href=\"#0\" class=\"popup-video\">\r\n");
          out.write("                                                            <div class=\"thumb\">\r\n");
          out.write("                                                                <img src=\"assets/images/icons/play-button.png\" alt=\"icons\">\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                            <span>watch trailer</span>\r\n");
          out.write("                                                        </a>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent(null);
    _jspx_th_c_set_3.setVar("n");
    _jspx_th_c_set_3.setScope("page");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.num}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_set_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent(null);
    _jspx_th_c_set_4.setVar("p");
    _jspx_th_c_set_4.setScope("page");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.page}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page-1<=0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <a href=\"#\"><i class=\"fas fa-angle-double-left\"></i><span>Prev</span></a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page-1>0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <a href=\"films?page=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(page-1)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><i class=\"fas fa-angle-double-left\"></i><span>Prev</span></a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setBegin(1);
    _jspx_th_c_forEach_3.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_3.setVar("i");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <a class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.page==i?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"films?page=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page+1<=n}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <a href=\"films?page=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(page+1)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><span>Next</span><i class=\"fas fa-angle-double-right\"></i></a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page+1>n}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <a href=\"#\"><span>Next</span><i class=\"fas fa-angle-double-right\"></i></a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }
}
