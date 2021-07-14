<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="dal.ListFilm"%>
<%@page import="model.Film"%>
<%@page import="dal.ShowDAO"%>
<%@page import="model.Showing"%>
<%@page import="dal.SeatDAO"%>
<%@page import="model.Ticket"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="javax.enterprise.context.RequestScoped"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


<!-- Mirrored from pixner.net/boleto/demo/movie-checkout.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:47:25 GMT -->
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
    
    <!-- ==========Banner-Section========== -->

    <!-- ==========Page-Title========== -->
    
    <!-- ==========Page-Title========== -->

    <!-- ==========Movie-Section========== -->
    <div class="movie-facility padding-bottom padding-top">
        <div class="container">
            <div class="row">
                <div class="col-lg-8">
<!--                    <div class="checkout-widget d-flex flex-wrap align-items-center justify-cotent-between">
                        <div class="title-area">
                            <h5 class="title">Already a Boleto  Member?</h5>
                            <p>Sign in to earn points and make booking easier!</p>
                        </div>
                        <a href="#0" class="sign-in-area">
                            <i class="fas fa-user"></i><span>Sign in</span>
                        </a>
                    </div>-->
                    
                    <div class="checkout-widget checkout-contact">
                        <h5 class="title">Promo Code </h5>
                        <form class="checkout-contact-form">
                            <div class="form-group">
                                <input type="text" placeholder="Please enter promo code">
                            </div>
                            <div class="form-group">
                                <input type="submit" value="Verify" class="custom-button">
                            </div>
                        </form>
                    </div>
                    <div class="checkout-widget checkout-card mb-0">
                        <h5 class="title">Payment Option </h5>
                        <ul class="payment-option">
                            <li class="active">
                                <a href="#0">
                                    <img src="assets/images/payment/card.png" alt="payment">
                                    <span>Credit Card</span>
                                </a>
                            </li>
                            <li>
                                <a href="#0">
                                    <img src="assets/images/payment/card.png" alt="payment">
                                    <span>Debit Card</span>
                                </a>
                            </li>
                            <li>
                                <a href="#0">
                                    <img src="assets/images/payment/paypal.png" alt="payment">
                                    <span>paypal</span>
                                </a>
                            </li>
                        </ul>
                        <h6 class="subtitle">Enter Your Card Details </h6>
                        <form class="payment-card-form">
                            <div class="form-group w-100">
                                <label for="card1">Card Details</label>
                                <input type="text" id="card1">
                                <div class="right-icon">
                                    <i class="flaticon-lock"></i>
                                </div>
                            </div>
                            <div class="form-group w-100">
                                <label for="card2"> Name on the Card</label>
                                <input type="text" id="card2">
                            </div>
                            <div class="form-group">
                                <label for="card3">Expiration</label>
                                <input type="text" id="card3" placeholder="MM/YY">
                            </div>
                            <div class="form-group">
                                <label for="card4">CVV</label>
                                <input type="text" id="card4" placeholder="CVV">
                            </div>
                            <div class="form-group check-group">
                                <input id="card5" type="checkbox" checked>
                                <label for="card5">
                                    <span class="title">QuickPay</span>
                                    <span class="info">Save this card information to my Boleto  account and make faster payments.</span>
                                </label>
                            </div>
                            <div class="form-group">
                                <input type="submit" class="custom-button" value="make payment">
                            </div>
                        </form>
                        <p class="notice">
                            By Clicking "Make Payment" you agree to the <a href="#0">terms and conditions</a>
                        </p>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="booking-summery bg-one">
                        <h4 class="title">booking summery</h4>
                        <ul>
<!--                            <li>
                                <h6 class="subtitle">Venus</h6>
                                <span class="info">English-2d</span>
                            </li>-->
  
                            <%List<Ticket> cart = (List<Ticket>)request.getSession().getAttribute("cart");
                            SeatDAO s = new SeatDAO();
                            int sum=0;
                            for(Ticket t:cart){
                                sum+=t.getPrice();
                                Showing sh = new ShowDAO().getShowByID(Integer.toString(t.getShow_id()));
                                Film f = new ListFilm().getFilmByID(sh.getFilm_id());
                            %>
                                

                            
                                <li>
                                    <h6 class="subtitle"><span><%=f.getName()%></span><span><%=s.getSeatById(t.getSeat_id())%></span></h6>
                                    <div class="info"><span><%=sh.getTime()%></span> <span><fmt:formatNumber type="currency"  value="<%=t.getPrice()%>" /></span></div>
                                </li>
                                <%}%>
                            
<!--                            <li>
                                <h6 class="subtitle mb-0"><span>Tickets  Price</span><span>$150</span></h6>
                            </li>-->
                        </ul>
                    </div>
                    <div class="proceed-area  text-center">
                        <h6 class="subtitle"><span>Total</span><span><fmt:formatNumber type="currency"  value="<%=sum%>" /></span></h6>
                        <a href="films" class="custom-button back-button">More Orders</a>
                        <a href="purchase" class="custom-button back-button">proceed</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
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
</body>


<!-- Mirrored from pixner.net/boleto/demo/movie-checkout.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:47:26 GMT -->
</html>