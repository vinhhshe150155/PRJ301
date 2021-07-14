package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Seat;
import java.util.List;
import dal.SeatDAO;
import javax.enterprise.context.RequestScoped;

public final class movie_002dseat_002dplan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:substringBefore", org.apache.taglibs.standard.functions.Functions.class, "substringBefore", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      java.util.Date now = null;
      synchronized (_jspx_page_context) {
        now = (java.util.Date) _jspx_page_context.getAttribute("now", PageContext.PAGE_SCOPE);
        if (now == null){
          now = new java.util.Date();
          _jspx_page_context.setAttribute("now", now, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
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
      out.write("    <style> \r\n");
      out.write("        .number-seat{\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("        .selected{\r\n");
      out.write("        }\r\n");
      out.write("/*        .seat-hover :hover + .number-seat{\r\n");
      out.write("            background-color: black;\r\n");
      out.write("            display: block;\r\n");
      out.write("            \r\n");
      out.write("        }*/\r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
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
      out.write("              <a href=\"home\" >Home</a>\r\n");
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
      out.write("    <section class=\"details-banner hero-area bg_img seat-plan-banner\" data-background=\"assets/images/banner/banner04.jpg\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"details-banner-wrapper\">\r\n");
      out.write("                <div class=\"details-banner-content style-two\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <h3 class=\"title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("                    <div class=\"tags\">\r\n");
      out.write("                        <a href=\"#0\">City Walk</a>\r\n");
      out.write("                        <a href=\"#0\">English - 2D</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- ==========Banner-Section========== -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ==========Page-Title========== -->\r\n");
      out.write("    ");
String roomID = request.getParameter("room")==null?"1":request.getParameter("room");
      out.write("\r\n");
      out.write("    <section class=\"page-title bg-one\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"page-title-area\">\r\n");
      out.write("                <div class=\"item md-order-1\">\r\n");
      out.write("                    <a href=\"films\" class=\"custom-button back-button\">\r\n");
      out.write("                        <i class=\"flaticon-double-right-arrows-angles\"></i>back\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form action=\"seat\" method=\"post\">\r\n");
      out.write("                    <div class=\"item date-item\">                  \r\n");
      out.write("                        <select class=\"select-bar\">\r\n");
      out.write("                            <option value=\"sc1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.film_start_date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\r\n");
      out.write("                            <option value=\"sc2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.film_end_date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select class=\"select-bar\">\r\n");
      out.write("                            <option value=\"sc1\">09:40</option>\r\n");
      out.write("                            <option value=\"sc2\">13:45</option>\r\n");
      out.write("                            <option value=\"sc3\">15:45</option>\r\n");
      out.write("                            <option value=\"sc4\">19:50</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <span>room</span>\r\n");
      out.write("                        <select name=\"room\" class=\"select-bar\" onchange=\"this.form.submit()\" >\r\n");
      out.write("                            <option value=\"");
      out.print(roomID);
      out.write("\" selected=\"selected\">");
      out.print(roomID);
      out.write("</option>\r\n");
      out.write("                            <option value=\"1\">1</option>\r\n");
      out.write("                            <option value=\"2\">2</option>\r\n");
      out.write("                            <option value=\"3\">3</option>\r\n");
      out.write("                            <option value=\"4\">4</option>\r\n");
      out.write("                            \r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <h5 class=\"title\">05:00</h5>\r\n");
      out.write("                    <p>Mins Left</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- ==========Page-Title========== -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ==========Movie-Section========== -->\r\n");
      out.write("    <div class=\"seat-plan-section padding-bottom padding-top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"screen-area\">\r\n");
      out.write("                <h4 class=\"screen\">screen</h4>\r\n");
      out.write("                <div class=\"screen-thumb\">\r\n");
      out.write("                    <img src=\"assets/images/movie/screen-thumb.png\" alt=\"movie\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <h5 class=\"subtitle\">normal seat</h5>\r\n");
      out.write("                <div class=\"screen-wrapper\">\r\n");
      out.write("                    <ul class=\"seat-area\">\r\n");
      out.write("                        ");
String normalSeat="AB";
                        String vjpSeat = "CDEFG";
      out.write("\r\n");
      out.write("                        ");
for(int i=0; i<normalSeat.length(); i++){
                        char row = normalSeat.charAt(i);
                        
      out.write("\r\n");
      out.write("                            <li class=\"seat-line\">\r\n");
      out.write("                            <span>");
      out.print(row);
      out.write("</span>\r\n");
      out.write("                            <ul class=\"seat--area\">\r\n");
      out.write("                                <li class=\"front-seat\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        ");
List<Seat> seats = new dal.SeatDAO().getSeatByRow(Integer.parseInt(roomID), row);
      out.write("\r\n");
      out.write("                                        ");
for(Seat s:seats){
      out.write("\r\n");
      out.write("                                            <div class=\"\">\r\n");
      out.write("                                                ");
if(s.getStatus()==0){
      out.write("\r\n");
      out.write("                                                    <li class=\"single-seat seat-hover\">\r\n");
      out.write("\r\n");
      out.write("                                                    <img src=\"assets/images/movie/seat01-free.png\" alt=\"seat\">\r\n");
      out.write("                                                    <span class=\"sit-num\">");
      out.print(s.getSeat_id());
      out.write("</span>  \r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                ");
}else{
      out.write("\r\n");
      out.write("                                                    <li class=\"single-seat\">\r\n");
      out.write("                                                    <img src=\"assets/images/movie/seat01.png\" alt=\"seat\">\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                                ");
}
      out.write("\r\n");
      out.write("                                            </div>                                            \r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <span>");
      out.print(row);
      out.write("</span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <h5 class=\"subtitle\">vjp seat</h5>\r\n");
      out.write("                <div class=\"screen-wrapper\">\r\n");
      out.write("                    <ul class=\"seat-area\">\r\n");
      out.write("                        ");
for(int i=0; i<vjpSeat.length(); i++){
                        char row = vjpSeat.charAt(i);
                        
      out.write("\r\n");
      out.write("                            <li class=\"seat-line\">\r\n");
      out.write("                            <span>");
      out.print(row);
      out.write("</span>\r\n");
      out.write("                            <ul class=\"seat--area\">\r\n");
      out.write("                                <li class=\"front-seat\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        ");
List<Seat> seats = new dal.SeatDAO().getSeatByRow(Integer.parseInt(roomID), row);
      out.write("\r\n");
      out.write("                                        ");
for(Seat s:seats){
      out.write("\r\n");
      out.write("                                            <div class=\"\">\r\n");
      out.write("                                                ");
if(s.getStatus()==0){
      out.write("\r\n");
      out.write("                                                <li class=\"single-seat seat-hover\">\r\n");
      out.write("\r\n");
      out.write("                                                    <img id=\"");
      out.print(s.getSeat_id()+"-"+row+""+s.getNum());
      out.write("\" src=\"assets/images/movie/seat01-free.png\" alt=\"seat\" onclick=\"select(this.id);\">\r\n");
      out.write("                                                    <span class=\"sit-num\">");
      out.print(s.getSeat_id());
      out.write("</span>  \r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                ");
}else{
      out.write("\r\n");
      out.write("                                                    <li class=\"single-seat\">\r\n");
      out.write("                                                        <img src=\"assets/images/movie/seat01.png\" alt=\"seat\">\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                ");
}
      out.write("\r\n");
      out.write("                                            </div>                                            \r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <span>");
      out.print(row);
      out.write("</span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"proceed-book bg_img\" data-background=\"assets/images/movie/movie-bg-proceed.jpg\">\r\n");
      out.write("                <div class=\"proceed-to-book\">\r\n");
      out.write("                    <div class=\"book-item\">\r\n");
      out.write("                        <span>You have Choosed Seat</span>\r\n");
      out.write("                        <h3 id=\"selected-seats\" class=\"title\"></h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"book-item\">\r\n");
      out.write("                        <span>total price</span>\r\n");
      out.write("                        <h3 class=\"title\">$150</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"book-item\">\r\n");
      out.write("                        <a href=\"movie-checkout.html\" class=\"custom-button\">proceed</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
      out.write("                        <p>Copyright Â© 2020.All Rights Reserved By <a href=\"#0\">Boleto </a></p>\r\n");
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
      out.write("    <script>\r\n");
      out.write("        function select(value) {\r\n");
      out.write("            var e = document.getElementById(value);\r\n");
      out.write("//            alert(value)\r\n");
      out.write("            \r\n");
      out.write("            if(e.className===\"selectedSeat\"){\r\n");
      out.write("                e.className=\"\";\r\n");
      out.write("                e.style.backgroundColor = \"#001232\";\r\n");
      out.write("            }else{\r\n");
      out.write("                e.style.backgroundColor = \"green\";\r\n");
      out.write("                e.className = \"selectedSeat\";\r\n");
      out.write("            }\r\n");
      out.write("//            console.log(document.getElementById(value).className)\r\n");
      out.write("            var s = document.getElementsByClassName('selectedSeat');\r\n");
      out.write("//            console.log(s)\r\n");
      out.write("            var str = \"\";\r\n");
      out.write("            for(let i=0; i<s.length; i++){\r\n");
      out.write("                str+=s[i].id.split(\"-\")[1]+\", \";\r\n");
      out.write("            }\r\n");
      out.write("            document.getElementById(\"selected-seats\").innerHTML = str.substring(0,str.length-2);\r\n");
      out.write("//            console.log(str);\r\n");
      out.write("        };\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from pixner.net/boleto/demo/movie-seat-plan.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:47:25 GMT -->\r\n");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setVar("time");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${now}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setPattern("dd/MM/yyyy");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_var_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
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

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("f");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.film}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}
