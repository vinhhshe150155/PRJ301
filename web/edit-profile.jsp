
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
                        <h5 class="title">Edit profile </h5>
                        <form class="checkout-contact-form" method="POST" action="edit-profile">
                            <c:set value="${sessionScope.account}" var="acc"></c:set>
                            
                            <div class="form-group">
                                ID: <input type="text" name="id" value="${acc.id}" readonly>
                            </div>
                            <div class="form-group">
                                Name: <input type="text" name="name" value="${acc.name}">
                            </div>
                            <div class="form-group">
                                Email: <input type="text" name="email" value="${acc.email}" readonly>
                            </div>
                            <div class="form-group">
                                Password: <input type="password" name="password" value="${acc.password}">
                            </div>
                            <div class="form-group">
                                Address:<input type="text" name="address" value=" ${acc.address}">
                            </div>
                            <div class="form-group">
                                Phone: <input type="text" name="phone" value="${acc.phone}">
                            </div>
                            <div class="form-group">
                                <input type="submit" value="Save" class="custom-button">
                            </div>
                        </form>
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