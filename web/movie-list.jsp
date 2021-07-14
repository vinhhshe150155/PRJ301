<%@page import="java.util.ArrayList"%>
<%@page import="model.Language"%>
<%@page import="dal.LanguageDAO"%>
<%@page import="java.util.List"%>
<%@page import="javax.enterprise.context.RequestScoped"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


<!-- Mirrored from pixner.net/boleto/demo/movie-list.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:46:43 GMT -->
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/all.min.css">
    <link rel="stylesheet" href="assets/css/animate.css">
    <link rel="stylesheet" href="assets/css/flaticon.css">
    <link rel="stylesheet" href="assets/css/magnific-popup.css">
    <link rel="stylesheet" href="assets/css/odometer.css">
    <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
    <link rel="stylesheet" href="assets/css/owl.theme.default.min.css">
    <link rel="stylesheet" href="assets/css/nice-select.css">
    <link rel="stylesheet" href="assets/css/main.css">

    <link rel="shortcut icon" href="assets/images/favicon.png" type="image/x-icon">

    <title>Boleto  - Online Ticket Booking Website HTML Template</title>


</head>

<body>
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
        <div class="banner-bg bg_img bg-fixed" data-background="assets/images/banner/banner02.jpg"></div>
        <div class="container">
            <div class="banner-content">
                <h1 class="title bold">get <span class="color-theme">movie</span> tickets</h1>
                <p>Buy movie tickets in advance, find movie times watch trailers, read movie reviews and much more</p>
            </div>
        </div>
    </section>
    <!-- ==========Banner-Section========== -->

    <!-- ==========Ticket-Search========== -->
    <jsp:include page="movie-search.jsp"></jsp:include>  
    <!-- ==========Ticket-Search========== -->

    <!-- ==========Movie-Section========== -->
    <section class="movie-section padding-top padding-bottom">
        <div class="container">
            <div class="row flex-wrap-reverse justify-content-center">
                <div class="col-sm-10 col-md-8 col-lg-3">
                    <form action="films" method="get">
                    <div class="widget-1 widget-check">
                        <div class="widget-header">
                            <h5 class="m-title">Filter By</h5>
                            <a class="uncheckall clear-check" href="#0"> Clear All</a>                            
                        </div>
                        <div class="widget-1-body">
                            <h6 class="subtitle">Language</h6>
                            <div class="check-area">
                                <%List<Language> lang = new LanguageDAO().getAllLanguage();%>
                                <%String[] langchecked = (String[]) request.getAttribute("langChecked");%>
                                <%for(Language l:lang){
                                    boolean check = false;
                                    if(langchecked!=null)
                                    for(String s:langchecked){
                                        if(s.equals(Integer.toString(l.getId()))){
                                            check = true;
                                            break;
                                        }
                                    }
                                %>  
                                    <div class="form-group">
                                        <input  type="checkbox" name="lang" id="<%=l.getId()%>" <%=check?"checked":""%> value="<%=l.getId()%>"><label for="<%=l.getId()%>"><%=l.getName()%></label>
                                    </div>
                                <%}%> 
                            </div>
                        </div>
                    </div>

                    <div class="widget-1 widget-check">
                        <div class="widget-1-body">
                            <h6 class="subtitle">Category</h6>
                            <div class="check-area">
                                
                                    <c:forEach items="${requestScope.cate}" var="c">
                                        <div class="form-group">
                                            <c:set var="contains" value="false" />
                                                <c:forEach var="item" items="${requestScope.cateChecked}">
                                                    <c:if test="${item eq c.id}">
                                                        <c:set var="contains" value="true" />
                                                    </c:if>
                                                </c:forEach>
                                            <input  type="checkbox" name="cate" id="cate${c.id}" value="${c.id}" ${contains?"checked":""}><label for="cate${c.id}">${c.name}</label>
                                        </div>                                        
                                    </c:forEach>
                                    <input type="submit" value="Search">
                            </div>
                        </div>
                    </div>
                    </form>

                </div>
                <div class="col-lg-9 mb-50 mb-lg-0">
                    <div class="filter-tab tab">
                        <div class="filter-area">
                            <div class="filter-main">
                                <form action="films" method="get">
                                <div class="left">
                                    <div class="item">
                                        <span class="show">Show :</span>
                                        
                                            <select class="select-bar" name="show">
                                                <option value="7">------</option>
                                                <option value="7">7</option>
                                                <option value="12">12</option>
                                                <option value="18">18</option>
                                                <option value="21">21</option>
                                                <option value="24">24</option>
                                                <option value="27">27</option>
                                                <option value="30">30</option>
                                            </select>
                                    </div>
                                    <div class="item">
                                        <span class="show">Sort By :</span>
                                        <select class="select-bar" name="sort">
                                            <option value="1">-------</option>
                                            <option value="1">now showing</option>
                                            <option value="2">Name</option>
                                            <option value="3">most view</option>
                                            <option value="4">most rated</option>
                                        </select>
                                    </div>
                                    <input style="width:60px" type="submit" value="OK" >
                                </div>
                                    
                                </form>

                                <ul class="grid-button tab-menu">
                                    <li>
                                        <i class="fas fa-th"></i>
                                    </li>                            
                                    <li class="active">
                                        <i class="fas fa-bars"></i>
                                    </li>                            
                                </ul>
                            </div>
                        </div>
                        <div class="tab-area">
                            <div class="tab-item active">
                                <div class="movie-area mb-10" id="filmContent">
                                    <c:forEach items="${requestScope.films}" var="f">
                                    <div class="movie-list">
                                        <div class="movie-thumb c-thumb">
                                            <a href="film-detail?filmID=${f.filmID}" class="w-100 bg_img h-100" data-background="${f.film_image}">
                                                <img class="d-sm-none" src="" alt="movie">
                                            </a>
                                        </div>
                                        <div class="movie-content bg-one">
                                            <h5 class="title">
                                                <a href="film-detail?filmID=${f.filmID}">${f.name}</a>
                                            </h5>
                                            <p class="duration">${f.duration} min</p>
                                            <div class="movie-tags">
                                                <c:forEach items="${f.category}" var="c">
                                                    <a href="#0">${c.name}</a>
                                                </c:forEach>
                                            </div>
                                            <div class="release">
                                                <span>Release Date : </span> <a href="#0"> ${f.film_start_date}</a>
                                            </div>
                                        <div class="item" id="">
                                            <div class="item-header">
                                                <div class="rated" style="color: red">
                                                    <c:forEach begin="1" end="${f.rating}">
                                                        <i class="fas fa-heart"></i>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>
                                            <div class="book-area">
                                                <div class="book-ticket">
                                                    <div class="react-item mr-auto">
                                                        <a href="seat?film=${f.filmID}">
                                                            <div class="thumb">
                                                                <img src="assets/images/icons/book.png" alt="icons">
                                                            </div>
                                                            <span>book ticket</span>
                                                        </a>
                                                    </div>
                                                    <div class="react-item">
                                                        <a href="#0" class="popup-video">
                                                            <div class="thumb">
                                                                <img src="assets/images/icons/play-button.png" alt="icons">
                                                            </div>
                                                            <span>watch trailer</span>
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                        <div class="pagination-area text-center" id="pagination">
                            <c:set var="n" scope="page" value="${requestScope.num}"/>
                            <c:set var="p" scope="page" value="${requestScope.page}"/>
                            
                            <c:if test="${page-1<=0}">
                            <a href="#0"><i class="fas fa-angle-double-left"></i><span>Prev</span></a>
                            </c:if>
                            <c:if test="${page-1>0}">
                            <a href="films?page=${(page-1)}"><i class="fas fa-angle-double-left"></i><span>Prev</span></a>
                            </c:if>
                            <c:forEach begin="1" end="${n}" var="i">
                                <a class="${requestScope.page==i?"active":""}" href="films?page=${i}">${i}</a>
                            </c:forEach>
                            <c:if test="${page+1<=n}">
                            <a href="films?page=${(page+1)}"><span>Next</span><i class="fas fa-angle-double-right"></i></a>
                            </c:if>
                            <c:if test="${page+1>n}">
                            <a href="#0"><span>Next</span><i class="fas fa-angle-double-right"></i></a>
                            </c:if>
                            </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- ==========Movie-Section========== -->

    <!-- ==========Newslater-Section========== -->
    <jsp:include flush="true" page="footer.jsp"/>
    <!-- ==========Newslater-Section========== -->

    
    <script src="assets/js/jquery-3.3.1.min.js"></script>
    <script src="assets/js/modernizr-3.6.0.min.js"></script>
    <script src="assets/js/plugins.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
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
        $(document).ready(function() {
             // Check All
             $('.checkall').click(function() {
                 $("input:checkbox").attr("checked", true);
             });
             // Uncheck All
             $('.uncheckall').click(function() {

                 
                 $('input[type=checkbox]').prop('checked',false);
             });
         });  
    </script>
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
</body>


<!-- Mirrored from pixner.net/boleto/demo/movie-list.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:46:43 GMT -->
</html>