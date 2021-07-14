<%@page import="model.Seat"%>
<%@page import="java.util.List"%>
<%@page import="dal.SeatDAO"%>
<%@page import="javax.enterprise.context.RequestScoped"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate var="time" value="${now}" pattern="dd/MM/yyyy" />
<!DOCTYPE html>
<html lang="en">
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
        .number-seat{
            display: none;
        }
        #submit-seat{
            display: none;
        }
/*        .seat-hover :hover + .number-seat{
            background-color: black;
            display: block;
            
        }*/
        
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
    <section class="details-banner hero-area bg_img seat-plan-banner" data-background="assets/images/banner/banner04.jpg">
        <div class="container">
            <div class="details-banner-wrapper">
                <div class="details-banner-content style-two">
                    <c:set var="f" value="${requestScope.film}"/>
                    <h3 class="title">${f.name}</h3>
                    <div class="tags">
                        <a href="#0">City Walk</a>
                        <a href="#0">English - 2D</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- ==========Banner-Section========== -->

    <!-- ==========Page-Title========== -->
    <%String roomID = request.getParameter("room")==null?"1":request.getParameter("room");%>
    <section class="page-title bg-one">
        <div class="container">
            <div class="page-title-area">
                <div class="item md-order-1">
                    <a href="films" class="custom-button back-button">
                        <i class="flaticon-double-right-arrows-angles"></i>back
                    </a>
                </div>
                <c:set value="${requestScope.showData}" var="sd"></c:set>
                <form action="seat" method="get">
                    <input type="text" hidden name="filmID" value="${requestScope.film.filmID}">
                    <div class="item date-item">                                 
                        <select class="select-bar" name="showID" onchange="this.form.submit()">
                            
                            <c:if test="${sd==null}">
                                <option value="">Select time</option>
                            </c:if>
                            <c:if test="${sd!=null}">
                                <option value="${sd.id}">${sd.time}</option>
                            </c:if>
                            
                                <c:forEach items="${requestScope.show}" var="s">
                                <option value="${s.id}">${s.time}</option>                               
                            </c:forEach>
                        </select>
                    </div>
                </form>

                <div class="item">
                    <h5 class="title">Room</h5>
                    <p style="text-align: center">${sd.room_id}</p>
                    <!--<p>${requestScope.ticket[0].price}</p>-->
                </div>
            </div>
        </div>
    </section>
    <!-- ==========Page-Title========== -->

    <!-- ==========Movie-Section========== -->
    <div class="seat-plan-section padding-bottom padding-top">
        <div class="container">
            <div class="screen-area">
                <h4 class="screen">screen</h4>
                <div class="screen-thumb">
                    <img src="assets/images/movie/screen-thumb.png" alt="movie">
                </div>
                <h5 class="subtitle">normal seat</h5>
                <div class="screen-wrapper">
                    <ul class="seat-area">
                        <%String normalSeat = "AB";%>
                        <%for(int j=0; j<normalSeat.length(); j++){
                            char index = normalSeat.charAt(j);
                        %>
                            <li class="seat-line">
                            <span><%=index%></span>
                            <ul class="seat--area">
                                <li class="front-seat">
                                    <ul>
                                        <c:set value="${requestScope.ticket}" var="t"></c:set>
                                        <c:forEach begin="<%=(index-65)*15%>" end="<%=(index-65+1)*15-1%>" var="i">
                                            <div class="">
                                                <c:if test="${t[i].status==0}">
                                                    <li class="single-seat seat-hover">                                                  
                                                        <img id="${t[i].id}-${t[i].price}-<%=index%>${(i+1)%15==0?15:(i+1)%15}" src="assets/images/movie/seat01-free.png" alt="seat" onclick="select(this.id);">
                                                    <span class="sit-num"><%=index%>${(i+1)%15==0?15:(i+1)%15}</span>  
                                                    </li>
                                                </c:if>
                                                <c:if test="${t[i].status!=0}">                                                                                                  
                                                <li class="single-seat">
                                                    <img src="assets/images/movie/seat01.png" alt="seat">
                                                </li>
                                                </c:if>                                             
                                            </div>                                            
                                        </c:forEach>
                                    </ul>
                                </li>
                            </ul>
                            <span><%=index%></span>
                        </li>
                        <%}%>
                    </ul>
                </div>
                <h5 class="subtitle">vjp seat</h5>
                <div class="screen-wrapper">
                    <ul class="seat-area">
                        <%String vjpSeat = "CDEFG";%>
                        <%for(int j=0; j<vjpSeat.length(); j++){
                            char index = vjpSeat.charAt(j);
                        %>
                            <li class="seat-line">
                            <span><%=index%></span>
                            <ul class="seat--area">
                                <li class="front-seat">
                                    <ul>
                                        <c:set value="${requestScope.ticket}" var="t"></c:set>
                                        <c:forEach begin="<%=(index-65)*15%>" end="<%=(index-65+1)*15-1%>" var="i">
                                            <div class="">
                                                <c:if test="${t[i].status==0}">
                                                    <li class="single-seat seat-hover">                                                  
                                                        <img id="${t[i].id}-${t[i].price}-<%=index%>${(i+1)%15==0?15:(i+1)%15}" src="assets/images/movie/seat01-free.png" alt="seat" onclick="select(this.id);">
                                                    <span class="sit-num"><%=index%>${(i+1)%15==0?15:(i+1)%15}</span>  
                                                    </li>
                                                </c:if>
                                                <c:if test="${t[i].status!=0}">                                                                                                  
                                                <li class="single-seat">
                                                    <img src="assets/images/movie/seat01.png" alt="seat">
                                                </li>
                                                </c:if>                                             
                                            </div>                                            
                                        </c:forEach>
                                    </ul>
                                </li>
                            </ul>
                            <span><%=index%></span>
                        </li>
                        <%}%>
                    </ul>
                </div>
            </div>
            <div class="proceed-book bg_img" data-background="assets/images/movie/movie-bg-proceed.jpg">
                <div class="proceed-to-book">
                    <div class="book-item">
                        <span>You have Choosed Seat</span>
                        <h3 id="selected-seats" class="title"></h3>
                    </div>
                    <div class="book-item">
                        <span>total price</span>
                        <h3 id="selected-price" class="title"></h3>
                    </div>
                    <div class="book-item">
                        <form id="seat-id" action="order" method="POST">
                            
                            <input id="seat-array" name="seat-array" type="text" hidden>
                            <a id="submit-seat" href="javascript:$('#seat-id').submit();" class="custom-button">proceed</a>
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
    <script>
        function select(value) {
            var price=0;
            const selectedSeat = [];
            var e = document.getElementById(value);
//            alert(value)
            
            if(e.className==="selectedSeat"){
                e.className="";
                e.style.backgroundColor = "#001232";
            }else{
                e.style.backgroundColor = "green";
                e.className = "selectedSeat";
            }
//            console.log(document.getElementById(value).className)
            var s = document.getElementsByClassName('selectedSeat');
//            console.log(s)
            var str = "";
            for(let i=0; i<s.length; i++){
                var arr = s[i].id.split("-");
                str+=arr[2] + ", ";
                price+= parseInt(arr[1]);
                selectedSeat.push(arr[0]);
            }
            if(price>0){
                document.getElementById("submit-seat").style.display = "inline-block";
            }else{
                document.getElementById("submit-seat").style.display = "none";
            }
            document.getElementById("selected-seats").innerHTML = str.substring(0, str.length-2);
            document.getElementById("selected-price").innerHTML = new Intl.NumberFormat('vi-VN', { style: 'currency', currency: 'VND' }).format(price);
            document.getElementById("seat-array").value = selectedSeat;
            
//            console.log(document.getElementById("seat-array").value)
//            console.log(str);
        };
    </script>
    
</body>


<!-- Mirrored from pixner.net/boleto/demo/movie-seat-plan.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 06 Jun 2021 02:47:25 GMT -->
</html>