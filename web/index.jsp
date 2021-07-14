<%@page import="dal.SearchDAO"%>
<%@page import="java.util.List"%>
<%@page import="javax.enterprise.context.RequestScoped"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <!-- Mirrored from pixner.net/boleto/demo/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:43:23 GMT -->
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />

    <link rel="stylesheet" href="assets/css/bootstrap.min.css" />
    <link rel="stylesheet" href="assets/css/all.min.css" />
    <link rel="stylesheet" href="assets/css/animate.css" />
    <link rel="stylesheet" href="assets/css/flaticon.css" />
    <link rel="stylesheet" href="assets/css/magnific-popup.css" />
    <link rel="stylesheet" href="assets/css/odometer.css" />
    <link rel="stylesheet" href="assets/css/owl.carousel.min.css" />
    <link rel="stylesheet" href="assets/css/owl.theme.default.min.css" />
    <link rel="stylesheet" href="assets/css/nice-select.css" />
    <link rel="stylesheet" href="assets/css/jquery.animatedheadline.css" />
    <link rel="stylesheet" href="assets/css/main.css" />

    <link
      rel="shortcut icon"
      href="assets/images/favicon.png"
      type="image/x-icon"
    />

    <title>Boleto - Online Ticket Booking Website HTML Template</title>
  </head>

  
    <!-- ==========Preloader========== -->
    <div class="preloader">
      <div class="preloader-inner">
        <div class="preloader-icon">
          <span></span>
          <span></span>
        </div>
      </div>
    </div>
    <!-- ==========Preloader========== -->
    <!-- ==========Overlay========== -->
    <div class="overlay"></div>
    <a href="#0" class="scrollToTop">
      <i class="fas fa-angle-up"></i>
    </a>
    <!-- ==========Overlay========== -->

    <!-- ==========Header-Section========== -->
    <jsp:include page="header.jsp" flush="true"/>
    <!-- ==========Header-Section========== -->

    <!-- ==========Banner-Section========== -->
    <section class="banner-section">
      <div
        class="banner-bg bg_img bg-fixed"
        data-background="assets/images/banner/banner01.jpg"
      ></div>
      <div class="container">
        <div class="banner-content">
          <h1 class="title cd-headline clip">
            <span class="d-block">book your</span> tickets for
            <span class="color-theme cd-words-wrapper p-0 m-0">
              <b class="is-visible">Movie</b>
            </span>
          </h1>
          <p>Safe, secure, reliable ticketing!</p>
        </div>
      </div>
    </section>
    <jsp:include page="movie-search.jsp"/>
    <!-- ==========Movie-Main-Section========== -->
    <section class="movie-section padding-top padding-bottom bg-two">
      <div class="container">
        <div class="row flex-wrap-reverse justify-content-center">
          <div class="col-lg-3 col-sm-10 mt-50 mt-lg-0">
            <div class="widget-1 widget-facility">
              <div class="widget-1-body">
                <ul>
                  <li>
                    <a href="#0">
                      <span class="img"
                        ><img
                          src="assets/images/sidebar/icons/sidebar01.png"
                          alt="sidebar"
                      /></span>
                      <span class="cate">24X7 Care</span>
                    </a>
                  </li>
                  <li>
                    <a href="#0">
                      <span class="img"
                        ><img
                          src="assets/images/sidebar/icons/sidebar02.png"
                          alt="sidebar"
                      /></span>
                      <span class="cate">100% Assurance</span>
                    </a>
                  </li>
                  <li>
                    <a href="#0">
                      <span class="img"
                        ><img
                          src="assets/images/sidebar/icons/sidebar03.png"
                          alt="sidebar"
                      /></span>
                      <span class="cate">Our Promise</span>
                    </a>
                  </li>
                </ul>
              </div>
            </div>
            <div class="widget-1 widget-trending-search">
              <h3 class="title">Trending Searches</h3>
              <div class="widget-1-body">
                <ul>
                    <%List<String> slist = new SearchDAO().getTopSearch(4);%>
                    <%for(String s: slist){%>
                        <li>
                            <h6 class="sub-title">
                                <a href="films?name=<%=s%>"><%=s%></a>
                            </h6>
                            <p></p>
                        </li>
                    <%}%>
                </ul>
              </div>
            </div>
          </div>
          <div class="col-lg-9">
            <div class="article-section padding-bottom">
              <div class="section-header-1">
                <h2 class="title">movies</h2>
                <a class="view-all" href="films">View All</a>
              </div>
              <div class="row mb-30-none justify-content-center">
                  <!--film-->
                  <c:forEach items="${requestScope.film}" var="film">
                      <div class="col-sm-6 col-lg-4">
                  <div class="movie-grid">
                    <div class="movie-thumb c-thumb">
                      <a href="film-detail?filmID=${film.filmID}">
                        <img
                          src="${film.film_image}"
                          alt="movie"
                        />
                       
                      </a>
                    </div>
                    <div class="movie-content bg-one">
                      <h5 class="title m-0">
                        <a href="film-detail?filmID=${film.filmID}">${film.name}</a>
                      </h5>
                      
                      <ul class="movie-rating-percent">
                          <li>
                              <p>${film.duration} min</p>
                          </li>
                        <li>
                          <div class="thumb">
                            <img
                              src="assets/images/movie/tomato.png"
                              alt="movie"
                            />
                          </div>
                          <span class="content">${film.rating} points</span>
                        </li>
                        <li>
                          <div class="thumb">
                            <img
                              src="assets/images/movie/cake.png"
                              alt="movie"
                            />
                          </div>
                          <span class="content"></span>
                        </li>
                      </ul>
                    </div>
                  </div>
                </div>
                  </c:forEach>
                
                  <!--film-->
              </div>
            </div>
              <div class="article-section padding-bottom">
              <div class="section-header-1">
                <h2 class="title">showing</h2>
                <a class="view-all" href="films">View All Film</a>
              </div>
              <div class="row mb-30-none justify-content-center">
                  <!--film-->
                  <c:forEach items="${requestScope.fToday}" var="film">
                      <div class="col-sm-6 col-lg-4">
                  <div class="movie-grid">
                    <div class="movie-thumb c-thumb">
                      <a href="film-detail?filmID=${film.filmID}">
                        <img
                          src="${film.film_image}"
                          alt="movie"
                        />
                       
                      </a>
                    </div>
                    <div class="movie-content bg-one">
                      <h5 class="title m-0">
                        <a href="film-detail?filmID=${film.filmID}">${film.name}</a>
                      </h5>
                      
                      <ul class="movie-rating-percent">
                          <li>
                              <p>${film.duration} min</p>
                          </li>
                        <li>
                          <div class="thumb">
                            <img
                              src="assets/images/movie/tomato.png"
                              alt="movie"
                            />
                          </div>
                          <span class="content">${film.rating} points</span>
                        </li>
                        <li>
                          <div class="thumb">
                            <img
                              src="assets/images/movie/cake.png"
                              alt="movie"
                            />
                          </div>
                          <span class="content"></span>
                        </li>
                      </ul>
                    </div>
                  </div>
                </div>
                  </c:forEach>
                
                  <!--film-->
              </div>
            </div>
            <div class="article-section padding-bottom">
              <div class="section-header-1">
                <h2 class="title">events</h2>
                <a class="view-all" href="events.html">View All</a>
              </div>
              <div class="row mb-30-none justify-content-center">
                <div class="col-sm-6 col-lg-4">
                  <div class="event-grid">
                    <div class="movie-thumb c-thumb">
                      <a href="#0">
                        <img
                          src="assets/images/event/event01.jpg"
                          alt="event"
                        />
                      </a>
                      <div class="event-date">
                        <h6 class="date-title">28</h6>
                        <span>Dec</span>
                      </div>
                    </div>
                    <div class="movie-content bg-one">
                      <h5 class="title m-0">
                        <a href="#0">Digital Economy Conference 2020</a>
                      </h5>
                      <div class="movie-rating-percent">
                        <span>327 Montague Street</span>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-sm-6 col-lg-4">
                  <div class="event-grid">
                    <div class="movie-thumb c-thumb">
                      <a href="#0">
                        <img
                          src="assets/images/event/event02.jpg"
                          alt="event"
                        />
                      </a>
                      <div class="event-date">
                        <h6 class="date-title">28</h6>
                        <span>Dec</span>
                      </div>
                    </div>
                    <div class="movie-content bg-one">
                      <h5 class="title m-0">
                        <a href="#0">web design conference 2020</a>
                      </h5>
                      <div class="movie-rating-percent">
                        <span>327 Montague Street</span>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-sm-6 col-lg-4">
                  <div class="event-grid">
                    <div class="movie-thumb c-thumb">
                      <a href="#0">
                        <img
                          src="assets/images/event/event03.jpg"
                          alt="event"
                        />
                      </a>
                      <div class="event-date">
                        <h6 class="date-title">28</h6>
                        <span>Dec</span>
                      </div>
                    </div>
                    <div class="movie-content bg-one">
                      <h5 class="title m-0">
                        <a href="#0">digital thinkers meetup</a>
                      </h5>
                      <div class="movie-rating-percent">
                        <span>327 Montague Street</span>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- ==========Movie-Main-Section========== -->
    
    <!-- ==========Newslater-Section========== -->
    <jsp:include flush="true" page="footer.jsp"/>
    <!-- ==========Newslater-Section========== -->

    <script src="assets/js/jquery-3.3.1.min.js"></script>
    <script src="assets/js/modernizr-3.6.0.min.js"></script>
    <script src="assets/js/plugins.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/heandline.js"></script>
    <script src="assets/js/isotope.pkgd.min.js"></script>
    <script src="assets/js/magnific-popup.min.js"></script>
    <script src="assets/js/owl.carousel.min.js"></script>
    <script src="assets/js/wow.min.js"></script>
    <script src="assets/js/countdown.min.js"></script>
    <script src="assets/js/odometer.min.js"></script>
    <script src="assets/js/viewport.jquery.js"></script>
    <script src="assets/js/nice-select.js"></script>
    <script src="assets/js/main.js"></script>
    <script type="text/javascript">
                $(document).ready(function(){          

                $('#searchFilm').on('input', function(){

                        var name = $('#searchFilm').val();

                        $.ajax({

                                type: "GET",

                                url : "SearchAjax",

                                data: {name: name},

                                success: function(responseText){
//                                        document.getElementById("filmContent").innerHTML = responseText;
                                        document.getElementById("searchList").innerHTML = responseText;
                                }

                        });                          
                });
                var modal = document.getElementById('searchFilm');
                var popup = document.getElementById('searchList');
// When the user clicks anywhere outside of the modal, close it
                window.onclick = function(event) {
                    if (event.target !== modal) {
                      popup.style.display = "none";
                    }else{
                      popup.style.display = "flex";
                    } 
                };
         });
    </script>

  <!-- Mirrored from pixner.net/boleto/demo/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:44:42 GMT -->
</html>
