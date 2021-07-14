<%@page import="model.Actor"%>
<%@page import="java.util.List"%>
<%@page import="model.Category"%>
<%@page import="model.Language"%>
<%@page import="dal.ListFilm"%>
<%@page import="model.Film"%>
<%@page import="javax.enterprise.context.RequestScoped"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


<!-- Mirrored from pixner.net/boleto/demo/movie-details.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:46:43 GMT -->
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

    <style>
        #rating >input{
            display: none;
        }
        #rating>label{
            color: red;
        }
        #rating>label :active, #rating>label :hover{
                color: red;
        }

    </style>
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
    <section class="details-banner bg_img" data-background="assets/images/banner/banner03.jpg">
        <div class="container">
            <div class="details-banner-wrapper">
                <%String filmID = request.getParameter("filmID");
                    Film f = new ListFilm().getFilmByID(Integer.parseInt(filmID));
                %>
                <div class="details-banner-thumb">
                    <img src="<%=f.getFilm_image()%>" alt="movie">
                    <a href="https://www.youtube.com/embed/KGeBMAgc46E" class="video-popup">
                        <img src="assets/images/movie/video-button.png" alt="movie">
                    </a>
                </div>
                <input type="hidden" id="filmID" value=<%=f.getFilmID()%>>
                <div class="details-banner-content offset-lg-3">
                    <h3 class="title"><%=f.getName()%></h3>
                    <div class="tags">
<!--                        <a href="#0">English</a>
                        <a href="#0">Hindi</a>
                        <a href="#0">Telegu</a>
                        <a href="#0">Tamil</a>-->
                        <span>
                            <!--<a href="#0"></ a>|--> 
                            <%for(Language l: f.getLanguage()){%>
                            <%=l.getName()%> | 
                            <%}%>
                        </span>
                    </div>
                        <%for(Category l: f.getCategory()){%>
                            <a href="#0" class="button"><%=l.getName()%></a> 
                        <%}%>
                    
                    <div class="social-and-duration">
                        <div class="duration-area">
                            <div class="item">
                                <i class="fas fa-calendar-alt"></i><span><%=f.getFilm_start_date()%></span>
                            </div>
                            <div class="item">
                                <i class="far fa-clock"></i><span><%=f.getDuration()%> min</span>
                            </div>
                        </div>
                        <ul class="social-share">
                            <li><a href="#0"><i class="fab fa-facebook-f"></i></a></li>
                            <li><a href="#0"><i class="fab fa-twitter"></i></a></li>
                            <li><a href="#0"><i class="fab fa-pinterest-p"></i></a></li>
                            <li><a href="#0"><i class="fab fa-linkedin-in"></i></a></li>
                            <li><a href="#0"><i class="fab fa-google-plus-g"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>
    </section>
    <!-- ==========Banner-Section========== -->

    <!-- ==========Book-Section========== -->
    <section class="book-section bg-one">
        <div class="container">
            <div class="book-wrapper offset-lg-3">
                <div class="left-side">
                    <div class="item" id="">
                        <div class="item-header">
                            <h5 class="title"><%=f.getRating()%></h5>
                            <div class="rated">
                                <%for(int i=0; i<f.getRating(); i++){%>
                                    <i class="fas fa-heart"></i>
                                <%}%>
                            </div>
                        </div>
                        <p>Users Rating</p>
                    </div>
                    <c:set value="${sessionScope.account}" var="acc"></c:set>
                    <c:if test="${acc!=null}">
                        <div class="item">
                            <div class="item-header">
                                <div class="rated rate-it" id="rating">
                                    <c:forEach begin="1" end="5" var="i">
                                        <input type="radio" id="heart${i}" name="rating" value="${i}" checked>
                                        <label for="heart${i}"><i class="fas fa-heart"></i></label>
                                    </c:forEach>
                                </div>
                                <h5 class="title" id="ratePoint">0.0</h5>
                            </div>
                            <p><input id="sendRate" type="button" name="sendRate" class="custom-button" value="Rate it!"></p>
                        </div>
                    </c:if>
                    
                </div>
                <a href="seat?filmID=<%=f.getFilmID()%>" class="custom-button">book tickets</a>
            </div>
        </div>
    </section>
    <!-- ==========Book-Section========== -->

    <!-- ==========Movie-Section========== -->
    <section class="movie-details-section padding-top padding-bottom">
        <div class="container">
            <div class="row justify-content-center flex-wrap-reverse mb--50">
                <div class="col-lg-3 col-sm-10 col-md-6 mb-50">
                    <div class="widget-1 widget-tags">
                        <ul>
                            <li>
                                <a href="#0">2D</a>
                            </li>
                            <li>
                                <a href="#0">imax 2D</a>
                            </li>
                            <li>
                                <a href="#0">4DX</a>
                            </li>
                        </ul>
                    </div>
                    <div class="widget-1 widget-offer">
                        <h3 class="title">Applicable offer</h3>
                        <div class="offer-body">
                            <div class="offer-item">
                                <div class="thumb">
                                    <img src="assets/images/sidebar/offer01.png" alt="sidebar">
                                </div>
                                <div class="content">
                                    <h6>
                                        <a href="#0">Amazon Pay Cashback Offer</a>
                                    </h6>
                                    <p>Win Cashback Upto Rs 300*</p>
                                </div>
                            </div>
                            <div class="offer-item">
                                <div class="thumb">
                                    <img src="assets/images/sidebar/offer02.png" alt="sidebar">
                                </div>
                                <div class="content">
                                    <h6>
                                        <a href="#0">PayPal Offer</a>
                                    </h6>
                                    <p>Transact first time with Paypal and
                                        get 100% cashback up to Rs. 500</p>
                                </div>
                            </div>
                            <div class="offer-item">
                                <div class="thumb">
                                    <img src="assets/images/sidebar/offer03.png" alt="sidebar">
                                </div>
                                <div class="content">
                                    <h6>
                                        <a href="#0">HDFC Bank Offer</a>
                                    </h6>
                                    <p>Get 15% discount up to INR 100* 
                                        and INR 50* off on F&B T&C apply</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-9 mb-50">
                    <div class="movie-details">
                        <h3 class="title">photos</h3>
                        <div class="details-photos owl-carousel">
                            <div class="thumb">
                                <a href="assets/images/movie/movie-details01.jpg" class="img-pop">
                                    <img src="assets/images/movie/movie-details01.jpg" alt="movie">
                                </a>
                            </div>
                            <div class="thumb">
                                <a href="assets/images/movie/movie-details02.jpg" class="img-pop">
                                    <img src="assets/images/movie/movie-details02.jpg" alt="movie">
                                </a>
                            </div>
                            <div class="thumb">
                                <a href="assets/images/movie/movie-details03.jpg" class="img-pop">
                                    <img src="assets/images/movie/movie-details03.jpg" alt="movie">
                                </a>
                            </div>
                            <div class="thumb">
                                <a href="assets/images/movie/movie-details01.jpg" class="img-pop">
                                    <img src="assets/images/movie/movie-details01.jpg" alt="movie">
                                </a>
                            </div>
                            <div class="thumb">
                                <a href="assets/images/movie/movie-details02.jpg" class="img-pop">
                                    <img src="assets/images/movie/movie-details02.jpg" alt="movie">
                                </a>
                            </div>
                            <div class="thumb">
                                <a href="assets/images/movie/movie-details03.jpg" class="img-pop">
                                    <img src="assets/images/movie/movie-details03.jpg" alt="movie">
                                </a>
                            </div>
                        </div>
                        <div class="tab summery-review">
                            <ul class="tab-menu">
                                <li class="active">
                                    summery
                                </li>
                                <li>
                                    user review <span>147</span>
                                </li>
                            </ul>
                            <div class="tab-area">
                                <div class="tab-item active">
                                    <div class="item">
                                        <h5 class="sub-title">Description</h5>
                                        <p><%=f.getFilm_description()%></p>
                                    </div>
                                    <div class="item">
                                        <div class="header">
                                            <h5 class="sub-title">cast</h5>
                                            <div class="navigation">
                                                <div class="cast-prev"><i class="flaticon-double-right-arrows-angles"></i></div>
                                                <div class="cast-next"><i class="flaticon-double-right-arrows-angles"></i></div>
                                            </div>
                                        </div>
                                        <div class="casting-slider owl-carousel">
                                            <%for(Actor a: f.getActor()){%>
                                                <div class="cast-item">
                                                <div class="cast-thumb">
                                                    <a href="#0">
                                                        <img src="assets/images/cast/cast01.jpg" alt="cast">
                                                    </a>
                                                </div>
                                                <div class="cast-content">
                                                    <h6 class="cast-title"><a href="#0"><%=a.getName()%></a></h6>
                                                    <span class="cate">actor</span>
                                                </div>
                                                </div>
                                            <%}%>
                                        </div>
                                    </div>
                                   
                                </div>
                                <div class="tab-item">
                                    <div class="movie-review-item">
                                        <div class="author">
                                            <div class="thumb">
                                                <a href="#0">
                                                    <img src="assets/images/cast/cast02.jpg" alt="cast">
                                                </a>
                                            </div>
                                            <div class="movie-review-info">
                                                <span class="reply-date">13 Days Ago</span>
                                                <h6 class="subtitle"><a href="#0">minkuk seo</a></h6>
                                                <span><i class="fas fa-check"></i> verified review</span>
                                            </div>
                                        </div>
                                        <div class="movie-review-content">
                                            <div class="review">
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                            </div>
                                            <h6 class="cont-title">Awesome Movie</h6>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer volutpat enim non ante egestas vehicula. Suspendisse potenti. Fusce malesuada fringilla lectus venenatis porttitor. </p>
                                            <div class="review-meta">
                                                <a href="#0">
                                                    <i class="flaticon-hand"></i><span>8</span>
                                                </a>
                                                <a href="#0" class="dislike">
                                                    <i class="flaticon-dont-like-symbol"></i><span>0</span>
                                                </a>
                                                <a href="#0">
                                                    Report Abuse
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="movie-review-item">
                                        <div class="author">
                                            <div class="thumb">
                                                <a href="#0">
                                                    <img src="assets/images/cast/cast04.jpg" alt="cast">
                                                </a>
                                            </div>
                                            <div class="movie-review-info">
                                                <span class="reply-date">13 Days Ago</span>
                                                <h6 class="subtitle"><a href="#0">rudra rai</a></h6>
                                                <span><i class="fas fa-check"></i> verified review</span>
                                            </div>
                                        </div>
                                        <div class="movie-review-content">
                                            <div class="review">
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                            </div>
                                            <h6 class="cont-title">Awesome Movie</h6>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer volutpat enim non ante egestas vehicula. Suspendisse potenti. Fusce malesuada fringilla lectus venenatis porttitor. </p>
                                            <div class="review-meta">
                                                <a href="#0">
                                                    <i class="flaticon-hand"></i><span>8</span>
                                                </a>
                                                <a href="#0" class="dislike">
                                                    <i class="flaticon-dont-like-symbol"></i><span>0</span>
                                                </a>
                                                <a href="#0">
                                                    Report Abuse
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="movie-review-item">
                                        <div class="author">
                                            <div class="thumb">
                                                <a href="#0">
                                                    <img src="assets/images/cast/cast01.jpg" alt="cast">
                                                </a>
                                            </div>
                                            <div class="movie-review-info">
                                                <span class="reply-date">13 Days Ago</span>
                                                <h6 class="subtitle"><a href="#0">rafuj</a></h6>
                                                <span><i class="fas fa-check"></i> verified review</span>
                                            </div>
                                        </div>
                                        <div class="movie-review-content">
                                            <div class="review">
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                            </div>
                                            <h6 class="cont-title">Awesome Movie</h6>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer volutpat enim non ante egestas vehicula. Suspendisse potenti. Fusce malesuada fringilla lectus venenatis porttitor. </p>
                                            <div class="review-meta">
                                                <a href="#0">
                                                    <i class="flaticon-hand"></i><span>8</span>
                                                </a>
                                                <a href="#0" class="dislike">
                                                    <i class="flaticon-dont-like-symbol"></i><span>0</span>
                                                </a>
                                                <a href="#0">
                                                    Report Abuse
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="movie-review-item">
                                        <div class="author">
                                            <div class="thumb">
                                                <a href="#0">
                                                    <img src="assets/images/cast/cast03.jpg" alt="cast">
                                                </a>
                                            </div>
                                            <div class="movie-review-info">
                                                <span class="reply-date">13 Days Ago</span>
                                                <h6 class="subtitle"><a href="#0">bela bose</a></h6>
                                                <span><i class="fas fa-check"></i> verified review</span>
                                            </div>
                                        </div>
                                        <div class="movie-review-content">
                                            <div class="review">
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                                <i class="flaticon-favorite-heart-button"></i>
                                            </div>
                                            <h6 class="cont-title">Awesome Movie</h6>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer volutpat enim non ante egestas vehicula. Suspendisse potenti. Fusce malesuada fringilla lectus venenatis porttitor. </p>
                                            <div class="review-meta">
                                                <a href="#0">
                                                    <i class="flaticon-hand"></i><span>8</span>
                                                </a>
                                                <a href="#0" class="dislike">
                                                    <i class="flaticon-dont-like-symbol"></i><span>0</span>
                                                </a>
                                                <a href="#0">
                                                    Report Abuse
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="load-more text-center">
                                        <a href="#0" class="custom-button transparent">load more</a>
                                    </div>
                                </div>
                            </div>
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
        $(document).ready(function(){
            $("input[name='sendRate']").hover(function(){
                var radioValue = $("input[name='rating']:checked").val();
                if(radioValue){
                    document.getElementById('ratePoint').textContent = radioValue;
                }
            });
            $('#sendRate').on('click', function(){

                var rate = $('#ratePoint').text();
                var email = $('#accEmail').val();
                var filmID = $('#filmID').val();
                $.ajax({

                    type: "GET",

                    url : "rate",

                    data: {rate: rate, email: email, filmID: filmID},

                    success: function(responseText){
                        alert("Thanks")
//                                        document.getElementById("filmContent").innerHTML = responseText;
//                        document.getElementById("searchList").innerHTML = responseText;
                    }

                });                          
            });
        });
    </script>
</body>


<!-- Mirrored from pixner.net/boleto/demo/movie-details.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:47:20 GMT -->
</html>