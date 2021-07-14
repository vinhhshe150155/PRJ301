<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <style>
        .data-process{
            color: #31D7A9;
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
<h5 class="title">Hey guys, thanks for helping us insert <span class="data-process">${requestScope.tkAmount}</span> tickets and <span class="data-process">${requestScope.totalNum}</span> bills into database this month.<br/><br/> Total:  <span class="data-process"><fmt:formatNumber type="currency"  value="${requestScope.totalAmount}" /></span> this month.</h5>
<br/>
                    <c:forEach items="${requestScope.bill}" var="b">
                    <div class="checkout-widget checkout-contact">
                        <h5 class="title">ID: ${b.id}</h5>
                        <form class="checkout-contact-form">
                            <div class="form-group">
                                <p>Date: ${b.date}</p>
                                <p>Total: ${b.amount}</p>
                            </div>
                        </form>
                    </div>
                    </c:forEach>
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